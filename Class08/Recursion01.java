package JavaClass.Class08;


import java.util.*;
public class Recursion01 {
    

    // print number from n to 1 (increasing order) 

    public static void printNumber(int a ){

        if(a == 0) return ;

        printNumber(a-1);
        System.out.println(a);
    }
    public static  void main(String arga[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printNumber(a);
    }
}
