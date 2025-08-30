package JavaClass.Class13;
import java.util.*;
public class Stack05 {

    public static void addBottom(int val , Stack<Integer> st){ // reversh a stack in 0(1) spach 

        if(st.isEmpty()){
            st.push(val);
            return;
        }

        int data = st.pop();
        addBottom(val, st);
        st.push(data);

    }

    public static void reversS(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        
        int data = s.pop();
        reversS(s);
        addBottom(data, s);
    }

    
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        reversS(st);
        //System.out.println(st.peek());

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
        

    }
}
