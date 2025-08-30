package JavaClass.Class12;

public class LinkedList5 {
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addfirstt(int data){
        Node NewNode = new Node(data);
        if(head == null){
            NewNode = head = tail;
            return ;
        }
        NewNode.next = head;
        head = NewNode;
        
    }


    public static void main(String asl[]){


    }
}
