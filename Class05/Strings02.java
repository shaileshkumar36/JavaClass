package JavaClass.Class05;

import java.util.*;
public class Strings02 {


    public static StringBuilder stb(String str){
        StringBuilder sb = new StringBuilder("");
         for(int i=0;i<str.length();i++){
            Integer cout = 1;
            while(i<str.length()-1  && str.charAt(i) == str.charAt(i+1)){
                cout ++;
                i++;
            }sb.append(str.charAt(i));

            if(cout>1){
                sb.append(cout);
            }
            
         }
         return sb ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        System.out.println(st);
        System.out.println(stb(st));

    }
}