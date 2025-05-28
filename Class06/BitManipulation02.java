
// odd or even help of bitmanuplacan


package JavaClass.Class06;


public class BitManipulation02 {

    public static void  oddOrEven(int a){
        int bit =001;
        if((a & bit) == 1) System.out.println("Odd number");
        else System.out.println("number is Even");
    }

    public static  void main(String args[]){
        oddOrEven(6);
        oddOrEven(3);
    }
}
