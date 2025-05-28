package JavaClass.Class06;

public class BitManipulation01 {
    public static void main(String args[]){

        //and operater in bit
        int a = 5;
        int b = 4;
        System.out.println(a & b);

        //or operater in bit

        System.out.println(a | b);

        //Xor operater in bit
        System.out.println(a ^ b);

        // not operater in bit
        System.out.println(~0);

        String st = new String("shailesh");
        change(st);
        System.out.println(st);

    }
    public static void change(String st){
        st += st;
        //return stt;
    }
}
