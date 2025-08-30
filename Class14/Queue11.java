package JavaClass.Class14;

import java.util.*;

public class Queue11 {
    public static void main(String args[]){
        
        // int start[] = {1,3,0,5,8,5};
        // int end[] = {2,4,6,7,9,9};

        // int maxAct = 0 ;
        // ArrayList<Integer> and = new ArrayList<>();

        // maxAct = 1;
        // and.add(0);
        // int lastAnd = end[0];


        // for(int i =1;i<end.length;i++){
        //     if(start[i]>= lastAnd){
        //         and.add(i);
        //         maxAct++;
        //         lastAnd = end[i];
        //     }
        // }
       // System.out.println(maxAct);
       // System.out.println(and);


        int starts[] = {0,1,3,5,5,8};
        int end[] =    {6,2,4,7,9,9};

        int activity[][] = new int[end.length][3];
        //System.out.println(activity.length);

        for(int i =0;i<activity.length;i++){
            activity[i][0] = i;
            activity[i][1] = starts[i];
            activity[i][2] = end[i];
        }

        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();

        int maxAct = 0;
        ans.add(activity[0][0]);
        maxAct  = 1;
        int lastAnd = activity[0][2];

        for(int i =0;i<activity.length;i++){
            if(lastAnd <= activity[i][1]){
                maxAct++;
                ans.add(activity[i][0]);
                lastAnd = activity[i][2];
            }
        }
        System.out.println(maxAct);
        System.out.println(ans);
    }
}
