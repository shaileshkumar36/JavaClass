package JavaClass.Class12;

public class LinkedList1 {
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
    
    public void addLast(int data){

        Node newNode = new Node( data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
    }
    public void printL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node midNode(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean palindrom(){
        if(head == null || head.next == null){
            return true;
        }
        Node mid = midNode(head);
        Node priv = null;
        Node curen = mid;
        Node next;
        while(curen != null){
            next = curen.next;
            curen.next = priv;
            priv = curen;
            curen = next;
        }

        Node rig = priv;
        Node lef = head;
        while(rig != null){
            if( lef.data != rig.data){
                return false;
            }
            rig = rig.next;
            lef = lef.next;
        }
        return true;
    }
    public static void main(String args[]){

        LinkedList1 l = new LinkedList1();
        l.addLast(1);
        l.addLast(29);
        l.addLast(2);
        l.addLast(1);
        l.printL();
        System.out.println(l.palindrom());
        l.printL();

    }
}
