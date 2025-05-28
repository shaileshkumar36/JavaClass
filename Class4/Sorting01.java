package JavaClass.Class4;

public class Sorting01 {
    public static void main(String arga[]){
        //int n = 8;
        int arr[] = {88,5,6,7,8,22,3};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println(i + "outer loop "+arr[i]+ " shailesh kumar" + arr[j] + " j ka man" + j);
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println( "after ssoping" + arr[i]+" i " + arr[j]);
                    System.out.println(i + " "+arr[arr.length-1]);
                    
                }
                System.out.println(arr[i] + " aga;kjafjakdf");
            }
            System.out.println(arr[i] + " after soping element ");
        }
        
    }
}