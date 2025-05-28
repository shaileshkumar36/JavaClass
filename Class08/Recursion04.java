package JavaClass.Class08;

import java.util.*;

public class Recursion04 {


    // all fibonacci number 

    
    public static int allFib(int a){
        if(a == 1 || a== 0){
             //System.out.println(a);
             return a;
        }
       
         return allFib(a-1) + allFib(a-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        
        System.out.println("0");
        System.out.println("1");
        for(int i=2;i< a;i++){
             System.out.println(allFib(i));
        }
       

    }
}
