package JavaClass.Class15;

//import java.security.DrbgParameters.Capability;
import java.util.*;
public class Gridi {
    public static void main(String garg[]){
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int capicity = 50;

        double ratio[][] = new double[value.length][2];
        // ratio[][0] = index; ratio[][1] = ration of value/weight;
        for(int i =0;i<ratio.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];

        }
        
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));  // asending order;

        int cap2 = capicity;
        int ans = 0;
        for(int i=ratio.length-1;i>=0;i--){
            int ind = (int)ratio[i][0];
            if(cap2 >= weight[ind]){
                ans += value[ind];
                //System.out.println(ans);
                cap2 -= weight[ind];
            }else{
               
                ans += (ratio[i][1] * cap2);
                cap2 = 0;
                break;  
            }
        }
        System.out.println(ans);

    }
}
