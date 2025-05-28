package JavaClass.Class4;

public class Sorting03 {
    public static void main(String[] args) {
         int arr[] = {5,3,2,4,8,6,7,1};
        for(int i=1;i<arr.length;i++) {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
            
        }
        System.out.println("Sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}

