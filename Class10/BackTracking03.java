package JavaClass.Class10;

import java.util.Scanner;

public class BackTracking03 {
    public static Boolean isSafe(char bod[][] , int row , int col){

        // verticali up
        for(int i=row-1; i>=0;i--){
            if(bod[i][col] == 'Q') return false;
        }

        //diag left up
        for(int i = row-1, j=col-1; j>=0 && i>=0; j-- , i--){
            if(bod[i][j] == 'Q')return false;
        }


        // diag right up 
        for(int i= row-1, j = col+1;i>=0 && j<=bod.length-1;i--,j++){
            if(bod[i][j] == 'Q') return false;
        }
        return true;
    }

    public static void nQueen(char bod[][] ,int row){
        if(row == bod.length){
            printbod(bod);
            return;
        }
        for(int j =0;j<bod.length;j++){
        if(isSafe(bod,row,j)){
            bod[row][j] = 'Q';
            nQueen(bod,row+1);
            bod[row][j] = 'X';
        }
            
        }
    }



    public static void printbod(char bod[][]){
        System.out.println("------------bod--------");
        for(int i =0;i<bod.length; i++){
            for(int j=0;j<bod.length;j++){
                System.out.print(bod[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = 4;
        char bod[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                bod[i][j] = 'X';

            }
        }System.out.println();
        nQueen(bod , 0);
    }
}
