package JavaClass.Class11;
import java.util.*;

public class ArrayList03 {

    public static int mostwater(ArrayList<Integer> list){
       
        int lp = 0;
        int rp = list.size()-1;
        int ans = 0;
        while(lp < rp){
            int currht = Math.min(list.get(lp) , list.get(rp));
            int  wh = rp-lp;
            int curentWater = currht* wh;

            ans = Math.max(curentWater, ans);

            if(list.get(lp) < list.get(rp)) lp++;
            else if(list.get(lp)> list.get(rp)) rp--;
            else{
                lp++;
            }
        }
        return ans;
    }
    public static void main(String argsp[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        //System.out.println(list);
        System.out.println(mostwater(list));
    }
}
