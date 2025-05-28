package JavaClass.Class2Function;

import java.util.*;
// Call by value
public class Class1 {
    public static void CallbyValue(int arr[] ,int a){
        for(int i=0;i<arr.length;i++){
            arr[i] *= 2;
            a *= 2;
        }
        
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = {3,4,5,6,7};
        CallbyValue(arr,a);
        for(int i=0;i<arr.length;i++){
            System.out.println("arr changed value is :   "    + arr[i]);
            
        }System.out.println("a not changed value : "+a);


    }
}
