package JavaClass.Class3;

public class Array01 {
    public static void chang(int arr[],int a){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]*2;
        }
        a = 999;
    }
    public static void main(String[] args) {
        int ar[] = {2,4,6,8,10};
        int a = 2;
        chang(ar,a);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        System.out.println(a);
    }
}
