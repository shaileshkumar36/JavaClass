package JavaClass.Class13;
import java.util.*;

public class Stack03 {
    public static void inseart(Stack<Integer> st , int val){

        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int data = st.pop();
        inseart(st, val);
        st.push(data);
    }
    public static void main(String arga[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        

        inseart(st , 4);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
