package JavaClass.Class15;

import java.util.*;
public class Gridi1 {
    public static void main(String arg[]){

        int a[] = {4,8,1,7};
        int b[] = {2,3,6,5};

        Arrays.sort(a);
        Arrays.sort(b);

        int absolutval =0;

        for(int i =0;i<a.length;i++){
            absolutval += Math.abs(a[i]-b[i]);
        }
        System.out.println(absolutval);
    }
}
