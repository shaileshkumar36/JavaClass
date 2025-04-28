package JavaClass.Class4;

public class Sorting01 {
    public static void main(String arga[]){
        //int n = 8;
        int arr[] = {2,5,6,7,8,22,3};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}