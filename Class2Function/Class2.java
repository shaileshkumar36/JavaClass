package JavaClass.Class2Function;


// binary Search in array acnding order 

import java.util.*;
public class Class2 {

    public static void binarySearch(int ar[],int ind){

        int st = 0;
        int end = ar.length-1;

        while(st<=end){
            int mid = (st+end)/2;
            if(ar[mid] == ind){
                System.out.println(mid);
                break;
            }
            if(ar[mid]>ind) {
                end = mid-1;
            }
            if(ar[mid]< ind){
                st = mid+1;
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int b = 4;
        int ar[] = {2,4,5,6,7,7};
        int ind = 6;
        binarySearch(ar, ind);
        
    }
}
