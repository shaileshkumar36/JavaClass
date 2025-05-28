package JavaClass.Class08;

import java.util.*;

public class Recursion {


    // print the number from n to 1 (decriasing order)

    
    public static void printNumber(int a ){

        if(a == 0) return ;

        System.out.println(a);

        printNumber(a-1);
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printNumber(a);
    }
}
