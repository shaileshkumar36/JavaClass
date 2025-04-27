package JavaClass.Class1Basic;

import java.util.*;
public class Class1 {
    public static void main(String[] args) {
//calculate the prime number in between two number/

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        boolean b = true;
        for(int i =t;i<n;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    b=false;
                    break;
                    
                }
            }
            if(b){
                System.out.println(i);
            }
            b=true;
        }


    }
}
