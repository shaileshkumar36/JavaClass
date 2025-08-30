package JavaClass.Class11;

//import java.util.ArrayList;

import java.util.*;//all the file can access help of the * ;

public class ArrayList0 {
    public static void main(String arrp[]){
        ArrayList<Integer> List = new ArrayList<>();

        // add the element of arrayList
        List.add(5);
        List.add(4);
        List.add(3);
        List.add(2);
        List.add(1);

        // print thee all element of array List 
        System.out.println(List);

        // // get the element of ArrayList in the index;
        // int s = List.get(3);
        // System.out.println(s);
        // System.out.println(List.get(3));
        // System.out.println(List.get(4));

        // // remove the element of the List;
        // List.remove(3);
        // List.removeLast();
        // System.out.println(List);
        
        // // set the element in the List 
        // List.set( 4,6); // if you give the index which is    not present of array List it giv error
        // System.out.println(List);


        // // find the element are present the number are present in List or not 
        // System.out.println(List.contains(3));

        //calcluate the size of arrayList using function 
        int a = List.size();
        System.out.println(a);
    }
}
