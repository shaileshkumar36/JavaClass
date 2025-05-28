package JavaClass.Class08;

import java.util.*;
public class Recursion08 {

    public static int tiling(int a){
        if(a == 0 || a==1) return 1;

        return tiling(a-1) + tiling(a-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(tiling(2));
        
    }
}
