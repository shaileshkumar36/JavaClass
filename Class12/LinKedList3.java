package JavaClass.Class12;

import java.util.LinkedList;

public class LinKedList3 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this .next = next;
        }
    }
    public static Node head;
    public static Node tail;

     public void addFirst(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public static Node getMide(Node head){
        Node lef = head;
        Node rig = head.next;
        while(rig != null && rig.next != null){
            rig = rig.next.next;
            lef = lef.next;

        }
        return lef;
    }

    public static Node merg(Node head1, Node head2){
        
        Node mergNode = new Node(-1);
        Node temp = mergNode;

        while(head1!= null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head1 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergNode.next;
    }

    
    public static Node mergSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mid = getMide(head);

        Node rightNode = mid.next;
        mid.next = null;

        Node newRight = mergSort(rightNode);
        Node newLeft = mergSort(head);

        return merg(newRight , newLeft);
    }

    public static void printll(){

        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
            
        }
        System.out.println("null");
    }

    public static void main(String args[]){

        LinKedList3 ll = new LinKedList3();




        //LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addFirst(6);
        printll();
        head = mergSort(head);
        printll();
        
    }
}
