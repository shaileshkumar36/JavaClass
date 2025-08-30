package JavaClass.Class13;

import java.util.*;

public class Stack08 {


    public static Boolean  validPar(String st){

        if(st == ""){
            return false;
        }
        Stack<Character> s = new Stack<>();

        for(int i =0;i<st.length(); i++){

            char ch = st.charAt(i);

            if( ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if( (s.peek() == '(' && ch == ')' )  
                || (s.peek() =='{' && ch == '}') 
                || ( s.peek() =='[' && ch == ']')
                ){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;

        }else{
            return false;
        }
    }




    public static void main(String args[]){
        String st = "((((((()))";
        System.out.println(validPar(st));
    }
}
