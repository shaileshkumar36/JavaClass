package JavaClass.Class11;

import java.util.*;


public class ArrayList02 {
   public static void main(String aro[]){
        ArrayList<ArrayList <Integer> > List  = new ArrayList<>();
        ArrayList<ArrayList  > alls  = new ArrayList<>();

        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(3);
        List1.add(6);
        List1.add(9);
        List1.add(12);
        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(1);
        List2.add(2);
        List2.add(3);
        List2.add(4);
        List.add(List1);
        List.add(List2);
        System.out.println(List);


        ArrayList<String> List3 = new ArrayList<>();
        List3.add("shailesh");
        alls.add(List1 );
        alls.add(List2);
        alls.add(List3 );
        
        System.out.println(alls);

   }
}
