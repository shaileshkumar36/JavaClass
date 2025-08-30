package JavaClass.Class13;
import java.util.*;
public class Stack02 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(2);
        st.push(1);
        
       
        
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}
