package JavaClass.Class4;

public class Sorting03 {
    public static void main(String[] args) {
        int arr[] = {5,3,2,4,8,6,7,1};
        for(int i=1;i<arr.length;i++) {
            int current = i;
            int pos = i-1;
            while(pos>=0 && arr[current] < arr[pos]){
                int temp = arr[current];
            }

        }
    }
}
