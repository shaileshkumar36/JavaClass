package JavaClass.Class08;

import java.util.*;

public class Recursion02 {


    // find the factorial number 

    
    public static int factorial(int a){
        if( a == 0) return 1;

        return factorial(a-1) * a ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
