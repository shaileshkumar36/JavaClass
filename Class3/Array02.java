package JavaClass.Class3;

public class Array02 {
    public static void main(String args[]){

        // find the largest number in an array ;

        int arr[] = { 33,66,7,8,9,44,6,7,77,8,8,9,33,334};

        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("largest number in the array is : " + largest);
    }
}
