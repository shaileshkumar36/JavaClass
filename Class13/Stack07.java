package JavaClass.Class13;

import java.util.*;

public class Stack07 {  //next greater Element value
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> st = new Stack<>();
        int nextMax[] = new int[arr.length];

        for(int i = nextMax.length-1;i >=0;i--){

            // step 1 while loop heare
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){

                st.pop();
            }
             
            // step 2  cheak the stakc empty or not;

            if(st.isEmpty()){
                nextMax[i] = -1;
            }
            else{
                nextMax[i] = arr[st.peek()];
            }

            // step 3 add the value in stack ;

            st.push(i);
        }

        for(int i = 0;i<arr.length;i++){
            System.out.println(nextMax[i]);
        }
    }
}
