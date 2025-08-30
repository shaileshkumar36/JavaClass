package JavaClass.Class10;

public class BackTracking {

    public static void BackTrackingArray(int array[] ,int i , int val){
        if(array.length == i){
            printAr(array); // print the array if the come in finare position 
            return;

        }
        array[i]= val; // take the value for each position in array 
        BackTrackingArray(array , i+1, val+1);
        array[i] = val-2; // the dicrege the value in the arr for each position;
        return;

    }
    public static void printAr(int arr[]){ // print the array 
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4,5,6};
        BackTrackingArray(arr , 0,1);
        printAr(arr);
    }
}
