package JavaClass.Class08;

import java.util.*;
//if the array are shorted or not 
public class Recursion05 {
     
    public static boolean arrSort(int arr[] , int i){
        
        if(i>= arr.length) return true;
        
        
        return arr[i-1] < arr[i] && arrSort(arr,i+1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
 
        int arr[] ={3,5,6,7,9};

        // for(int i= 0;i< arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        if(arrSort(arr ,1)) System.out.println("Yes");
        else System.out.println("No");
        
    }
}
