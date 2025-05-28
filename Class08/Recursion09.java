package JavaClass.Class08;

import java.util.*;



public class Recursion09 {
// remove the dublick string 

    public static void reString(String st, int ind , StringBuilder sb, boolean map[]){
        if(ind == st.length()){
            System.out.println(sb);
            return;
        }
        char in = st.charAt(ind);
        if(map[in - 'a'] == true){
            reString( st,  ind+1  ,  sb ,  map);
        }else{
            map[in-'a'] = true;
            reString(st, ind+1 , sb.append(in), map);
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        reString("shhaileshh", 0,new StringBuilder("") ,   new boolean[26]); 


    }
}
