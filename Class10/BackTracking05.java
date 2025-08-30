package JavaClass.Class10;

public class BackTracking05 {
    public static int findGrid(int i ,int j , int n ,int m){
        if(i == n-1 && j == m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        return findGrid(i+1,j,n,m)+ findGrid(i ,j+1,n,m);
   }

    public static void main(String args[]){
        int n = 3;
        int m = 3;
        int arr[][] = new int[n][m];

        System.out.println(findGrid(0, 0, n, m));
    }
}
