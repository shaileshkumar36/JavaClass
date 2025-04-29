package JavaClass.Class4;


// selection sort 
public class Sorting02 {
    public static void main(String[] args) {
        int arr[] = {4,6,5,1,2,3};
        for(int i=0;i<arr.length;i++){
            int min =i;
            for(int j=i;j<arr.length-1;j++){
                if(arr[min]>arr[j]) {
                    min = j;
                }
            
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
