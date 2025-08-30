package JavaClass.Class14;

import java.util.*;
public class Queue10 {

    static class Stack{
        static Deque<Integer> Deque = new LinkedList<>();

        public static void push(int data){
            Deque.addLast(data);
        }
        public static int pop(){
            return Deque.removeLast();
        }
        public static int peek(){
            return Deque.getLast();
        }
    }

    static class Queue{

        Deque<Integer> q = new LinkedList<>();

        public void add(int data){
            q.addLast(data);
        }
        public int remove(){
            return q.removeFirst();
        }
        public int peek(){
            return q.getFirst();
        }
    }
    public static void main(String args[]){

        Stack ss = new Stack();

        ss.push(1);
        ss.push(2);
        ss.push(3);;

        // System.out.println(ss.peek());
        // System.out.println(ss.pop());
        // System.out.println(ss.pop());
        // System.out.println(ss.pop());


        Queue qq = new Queue();
        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);

        System.out.println(qq.peek());
        System.out.println(qq.remove());
        System.out.println(qq.remove());
        System.out.println(qq.remove());
        System.out.println(qq.remove());
    }
}
