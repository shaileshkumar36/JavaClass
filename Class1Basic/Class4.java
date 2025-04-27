package JavaClass.Class1Basic;

import java.util.*;
public class Class4 {
    public static void main(String[] args) {
        // print the Event number between two number
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int v = sc.nextInt();
        for(int i=a;i<v;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
