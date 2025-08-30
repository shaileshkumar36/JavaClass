package JavaClass.Class14;
import java.util.LinkedList;
import java.util.*;
public class Queue7 {
    public static void interLeve(Queue<Integer> q){

        Queue<Integer> qq= new LinkedList<>();
        int size = q.size()/2;

        for(int i =0;i<size;i++){
            qq.add(q.remove());

        }
        while(!qq.isEmpty()){
            q.add(qq.remove());
            q.add(q.remove());
        }
    }
    

    public static void main(String argap[]){
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeve(q);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
