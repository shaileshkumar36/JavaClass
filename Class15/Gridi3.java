package JavaClass.Class15;

import java.util.*;

public class Gridi3 {

    public static void main(String args[]){

        int coin[] = {5,2,500,1,100,10,20,50,200};

        Arrays.sort(coin);

        int count = 0;
        int amount = 1059;
        ArrayList<Integer> ans = new ArrayList<>();

         
        for(int i =coin.length-1;i>=0;i--){
            if(coin[i]<= amount){
                while(coin[i]<= amount){
                    count ++;
                    amount = amount-coin[i];
                    ans.add(coin[i]);
                }
            }
        }
        System.out.println(count);
        System.out.println(ans);
    }
}
