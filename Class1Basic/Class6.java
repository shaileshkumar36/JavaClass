package JavaClass.Class1Basic;


// input aray in argument and change the array in different matheod and print the array
import java.util.*;
public class Class6 {
// input array int argumrny snd change the array in different matheod and printl the array;
    public static void changeArray(int ar[],int n){
        for(int i=0;i<ar.length;i++){
            ar[i]= ar[i]*2;
        }
        n = 9;
        //return ar;
    }


// print the array in the same order as it is given in the  input;
    public  static void printArray(int ar[]){
        for(int i=0 ;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        printArray(ar);
        System.out.println("After changing the array:");
        changeArray(ar,n);
        printArray(ar);
        System.out.println("After changing the value of n:" + n + " (it is not changed in the main method)");
    }
}
