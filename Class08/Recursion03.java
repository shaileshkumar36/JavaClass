package JavaClass.Class08;

import java.util.*;


public class Recursion03 {

    // sum of first n natuaral number using Recursion 

    public static int sumOfN(int n){
        if(n == 0) return 0;

        return sumOfN(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(sumOfN(a));

    }
}
