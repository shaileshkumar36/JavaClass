package JavaClass.Class14;

import java.util.*;

public class Queue3 {
    
    public static void main(String argsp[]){

        Queue<Integer> q = new LinkedList<>();

        Queue<Integer> qq = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
