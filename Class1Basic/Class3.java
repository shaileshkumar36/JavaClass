package JavaClass.Class1Basic;

import java.util.*;
public class Class3 {
    public static void main(String[] args) {

 //find the greatest from 2number
 
     Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){
            System.out.println("The Greatest number "+b);
        }
        else{
            System.out.println("The Greatest number "+a);
        }
    }
}
