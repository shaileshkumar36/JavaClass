package JavaClass.Class14;

import java.util.*;
public class Queue9 {
    public static void main(String argbs[]){
        Deque<Integer> Deque = new LinkedList<>();

        Deque.addFirst(1); //1
        Deque.addLast(2);  //1,2
        Deque.addFirst(0);  //0,1,2
        Deque.removeLast();   //0,1
        Deque.removeFirst();  //1
        System.out.println( Deque.peekFirst());  //1
        System.out.println( Deque.peekLast());   //1

    }
}
