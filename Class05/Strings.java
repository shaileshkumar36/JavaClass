package JavaClass.Class05;

public class Strings {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("abcd");
        String str3 = "abcd";

        System.out.println(str == str3);


        System.out.println(str == str2);

                                       
        // String is IMMUTABLE;
    }
}
