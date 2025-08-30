package JavaClass.Class10;
import java.util.*;


public class BackTracking01{
    public static void subsetString(String st , String ans , int i ){
        if(i == st.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            
            return;
        }

        subsetString(st,ans+st.charAt(i), i+1);
        subsetString(st, ans, i+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        subsetString("abc", "", 0);
    }
}