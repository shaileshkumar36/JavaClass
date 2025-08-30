package JavaClass.Class09;

public class DivideAndConquer1{

    public static void margeSort(int arr[] , int st , int end){

        if(st >= end ){
            return; 
        }

        //work 
        
        int mid = st+(end-st)/2;

        margeSort(arr, st, mid); // left array
        margeSort(arr, mid+1, end); // rigth arrary

        marge(arr , st , end , mid);
    }

    public static void marge(int arr[] , int st , int end ,int mid){
          
    }


    public static void main(String[] args) {
        int arr[] = {3,5,2,9,6,7,1};

    }
}