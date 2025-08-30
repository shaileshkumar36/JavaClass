package JavaClass.Class13;

import java.util.*;

public class Stack09 {

    public static Boolean isvalid(String st ){

        Stack<Character>  s  = new Stack<>();

        for(int i =0;i<st.length();i++){

            char ch = st.charAt(i);
            
            if(ch == ')'){

                int count =0;
                while(s.peek() !=  '(' ){

                    s.pop();
                    count++;

                }
                if(count<1){
                    return true;

                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
           
        } return false;

    }


    public static void main(String args[]){
        String st = "(shil+(a+ b ))";
        System.out.println(isvalid(st));
    }
}
