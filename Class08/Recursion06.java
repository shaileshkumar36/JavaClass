package JavaClass.Class08;


import java.util.*;

public class Recursion06 {
    
// cheack the number are present in array return the index;
    public static int firstOcc(int arr[] , int a, int i){
        if(i>= arr.length) return -1;
        if(a == arr[i]) return   i;

        
        return firstOcc(arr, a, i+1);
        
    }

    public static void main(String arga[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int arrg[] = new int[a];

        for(int i=0;i<arrg.length;i++){
            arrg[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        //int i ;
        System.out.println(firstOcc(arrg, b, 0));
    }
}
