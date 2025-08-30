package JavaClass.Class14;

import java.util.*;
public class Queue4 {

    static class Queueji{ // using tow stack making queue
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static Boolean isEmty(){
                return s1.isEmpty();
            }

        public static void add(int data){
                
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static  int remove(){
            if(isEmty()){
                System.out.println("Queue are khle ha ");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isEmty()){
                System.out.println("Queue are khle ha ");
                return -1;
            }
            return s1.peek();
        }


    }
    
    
    public static void main(String args[]){
        Queueji q = new Queueji();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
