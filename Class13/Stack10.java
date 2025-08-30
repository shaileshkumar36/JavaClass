package JavaClass.Class13;
import java.util.*;

public class Stack10 {
    public static void maxArea(int arr[]){
         
        int maxAreaa = 0;
        int nsr[ ] = new int[arr.length];
        int nsl[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        // next small right 

        for(int i = arr.length-1;i>=0;i--){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();

            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        
        }


        s = new Stack<>();
        for(int i = 0 ;i<arr.length;i++){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();

            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        
        }

        //calculate the arey  
        for(int i =0;i<arr.length;i++){
            int height = arr[i];
            int whith = nsr[i]-nsl[i]-1;
            int curentare = height* whith;
            maxAreaa = Math.max(curentare, maxAreaa);
        }
        System.out.println(maxAreaa);
    }
    

    public static void main(String argsa[]){
        int arr[] = {2,1,5,6,2,3};

        maxArea(arr);

    }
}
