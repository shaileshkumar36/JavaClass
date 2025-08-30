package JavaClass.Class11;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList04 {
    public static void findTragt(ArrayList<Integer> list , int traget){

        int lp = 0;
        int rp = list.size();

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                lp = i+1;
                rp = i;
                break;
            }
        }
        int n = list.size();
        while(lp!= rp){
            if(list.get(lp) + list.get(rp) == traget) {
                System.out.println(lp +" "+ rp);
                return;
            }else if(list.get(lp) <list.get(rp)){
                rp = (n+rp-1)%n;
            }else{
                lp = (lp +1)%n;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int a = sc.nextInt();
            list.add(a);
        }
        System.out.println(list);
        int traget = sc.nextInt();
        findTragt( list , traget);
    }
}
