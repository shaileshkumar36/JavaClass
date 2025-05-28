package JavaClass.Class08;
import java.util.*;
public class Recursion07 {

    public static int pow(int a , int b ){
        if(b == 0){
            return 1;
        }
        return a * pow(a,b-1);
    }
// optimal solution of power 
    public static int optimalpow(int a , int b ){
        if(b == 0) {
            return 1;
        }
            int hafpow = optimalpow(a, b/2);

            int pow = hafpow * hafpow;
            if(b %2 != 0) {
                pow = a * pow;
            }
            return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.println(pow(a,b));

        System.out.println(optimalpow(a, b));
    }
}
