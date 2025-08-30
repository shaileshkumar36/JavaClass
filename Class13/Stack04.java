package JavaClass.Class13;

import java.util.*;

public class Stack04 {
    public static StringBuilder revershst(String st){ // revers a strign using stack

        Stack<Character> ch = new Stack<>();

        for(int i =0;i<st.length(); i++){
            ch.push(st.charAt(i));
        }

        StringBuilder ans = new StringBuilder("");

        while(!ch.isEmpty()){
            ans.append(ch.pop());
        }
        return ans;
    }

    public static void main(String args[]){
        String st = "abcdefghi";
        System.out.println(revershst(st));
    }
}
