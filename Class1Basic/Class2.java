package JavaClass.Class1Basic;

import java.util.*;
public class Class2 {
    public static void main(String[] args) {
//sum of first N natual number

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum +=i;
        }
        System.out.println(sum);
        
    }
}