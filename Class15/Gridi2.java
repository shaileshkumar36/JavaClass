package JavaClass.Class15;

import java.util.*;
public class Gridi2 {
    public static void main(String args[]){
        int pare[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pare,Comparator.comparingInt(o -> o[1]));

        int chainlen =1;
        int pareend = pare[0][1];

        for(int i =0;i<pare.length;i++){
            if(pare[i][0]> pareend){
                chainlen ++;
                pareend = pare[i][1];
            }
        }
        System.out.println(chainlen);

    }
}
