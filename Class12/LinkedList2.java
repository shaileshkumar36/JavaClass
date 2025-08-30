package JavaClass.Class12;
//import java.util.*;
import java.util.Scanner;

public class LinkedList2 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = null;
    }


    public void printll(){

        Node taile = head;
        while(taile != null){
            System.out.print(taile.data + " -> ");
            taile = taile.next;
        }System.out.println("null");
    }



    public static Boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            if(slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }


    public static void removeCycle(){
        //Detect a cycle 
        Node slow = head;
        Node fast = head;
        Boolean ans = false;
        while(fast != null && fast.next != null){
            if(slow == fast) {
                ans = true;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if(ans == false){
            return ;

        }

        Node pre = null;
        slow = head;
        while(slow != fast){
            pre = fast;
            slow = slow.next;
            fast = fast.next;

        }

        pre.next = null;
    }

    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        LinkedList2 ll = new LinkedList2();
        // ll.addNode(3);
        // ll.addNode(33);
        // Node newNode = new Node(34);

        // head.next.next = newNode;
        // ll.addNode(2);
        // ll.addNode(21);
        // ll.tail.next = newNode;
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);

        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;

        System.out.println(isCycle());//ll.printll();
        removeCycle();
       
        System.out.println(isCycle());
    }
}
