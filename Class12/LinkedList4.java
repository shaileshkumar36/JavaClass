package JavaClass.Class12;

public class LinkedList4 {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        
        Node newNode = new Node( data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printDll(){
        Node temp = head;
        while(temp != null){
             System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }System.out.println("null");
        
    }
    public static void main(String args[]){
        LinkedList4  dll = new LinkedList4();
        dll.addFirst(5);
        dll.addFirst(3);
        System.out.println(dll.size);
        dll.addFirst(2);
        dll.printDll();

    }
}
