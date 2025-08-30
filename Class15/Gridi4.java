package JavaClass.Class15;

import java.util.*;
public class Gridi4 {
    static class job {
        int id;
        int deadline;
        int profit;
        public job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String args[]) {
        int jobInfo[][] = {
            {4,20},
            {1,10},
            {1,40},
            {1,30}
        };
        ArrayList<job> jobs = new ArrayList<>();

        for(int i =0;i<jobInfo.length;i++){
            jobs.add(new job( i,jobInfo[i][0],jobInfo[i][1]));
        }

        Collections.sort(jobs, (obj1,obj2) ->  obj2.profit-obj1.profit);  

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i =0;i<jobInfo.length;i++){
            job currJob = jobs.get(i);
            if(currJob.deadline > time ) {
                seq.add(currJob.id);
                time++;
            }
        }
        System.out.println(seq);
    }
}
