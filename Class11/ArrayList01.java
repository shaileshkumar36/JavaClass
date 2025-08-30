package JavaClass.Class11;

//import java.util.*;  // if use this one you can use all the class whithout any import file;
import java.util.ArrayList; //only the inport ArrayList class;
import java.util.Collections;

public class ArrayList01 {
    // print the value using loop in the List 
    public static void printList(ArrayList<Integer> List){
        for(int i = 0 ;i<List.size();i++){
            System.out.print(List.get(i));
        }
        System.out.println();

        // for(int i = List.size()-1;i>=0;i--){
        //     System.out.print(List.get(i));
        // }
    }

    //find the maximum number in list
    public static void maxnum(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<list.size();i++){
            max = Math.max(max,list.get(i));
        }
        System.out.println(max);
    }

    // swap the two value in list
    public static void swap(ArrayList<Integer> list , int ind1 , int ind2){

        int temp = list.get(ind1);
        list.set(ind1 ,list.get(ind2)) ;
        list.set(ind2,temp);
        printList(list);
    }

    public static void main(String arga[]){

        ArrayList <Integer> List = new ArrayList<>();
        List.add(4);
        List.add(2);
        List.add(1);
        List.add(5);
        List.add(3);

        printList(List);//print the value in using toop 

        //MAXIMUM   NUMBER CALCULATE
        //maxnum(List);

        // //swap the value 
        // swap(List, 2, 4);;

        // sorting the list 
        Collections.sort(List);
        System.out.println(List);
    }
}
