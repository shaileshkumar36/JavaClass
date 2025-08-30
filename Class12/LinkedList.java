package JavaClass.Class12;

public class LinkedList {
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
    public static int size;



//add first in linkedList 
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }



// add the Node in last in LinkList 
    public void addLast(int data){

        Node newNode = new Node(data);
        size++;
        tail.next = newNode;
        newNode.next = null; 
        tail = newNode;
    }



// add the Node in midel 
    public void addMidl(int data , int ind){
        if(ind == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i != ind-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }



    // println the value
    public static void printll(){

        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
            
        }
        System.out.println("null");
    }


//remove element in lest
    public static int removeLast(){
        if(head == null){
            System.out.println("the function are empty");
            return size;
        }else if(size == 1){
            head = tail = null;
            size = 1;
            return size;
        }
        Node prev = head;
        for(int i =0;i<size-2;i++){
            prev = prev.next;
        }

        prev.next = null;
        tail = prev;
        size--;
        return size;
    }


//remove element in fist
    public int removeFist(){
        if(head == null){
            System.out.println("the function are empty");
            return size;
        }else if(size == 1){
            head = tail = null;
            size = 1;
            return size;
        }
        head = head.next;
        size--;
        return size;

    }
//search the value in linkedList
    public static int LinarSearch(int key){
        Node temp = head;
        int i =0;
        while(temp != null){
            if(temp.data == key)return i;
            temp = temp.next;
            i++;
        }
         return -1;
    }


//search the value in LinkedList in using recargan 

    public static int helper(Node head ,int key){
        if(head == null){
            return -1;

        }
        if(head.data == key)return 0;
        int ind = helper( head.next, key);

        if(ind == -1)return -1;

        return ind+1;
    }
    public static int recargans(int key){
        int a =helper(head,key);
        return a;
    }



    public static void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next ;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }



    public static void removeEnd(int n){
        int sz = 0;
        Node temp = tail;
        while(temp!= null){
            sz++;
            temp = temp.next;
        }
        if(size == n){
            head = head.next;
            return;
        }
        int i = 1;
        int iTo = sz-n;
        Node prev = head;
        while(i<iTo){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }


    private static Node findNodeMid(Node head){
        Node solow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            solow = solow.next;
        }
        return solow;
    }
    public static Boolean Palindrom(){
        if(head == null || head.next == null) return true;

        Node mid = findNodeMid(head);

        Node cure = mid;
        Node pre = null;
        Node nextt;
        while(cure != null){
             nextt = cure.next;
             cure.next = pre;
             pre = cure;
             cure = nextt;           
        }
        Node right = pre;
        Node left = head;
        while(right != null){
            if(right.data != left.data){
                return false;
            }
            
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String arhs[]){
        LinkedList ll = new LinkedList();
        // printll();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // printll();
        // ll.addLast(4);
        // printll();
        // ll.addLast(5);
        // printll();
        // ll.addMidl(3,2);
        // printll();
        // ll.addMidl(0, 0);
        // printll();
        // System.out.println(ll.size);
        // System.out.println(ll.removeFist());
        // printll();
        // System.out.println(ll.removeLast());
        // printll();
        // //System.out.println(LinarSearch(3));
        // System.out.println(recargans(3));
        // reverse();
        // printll();
        // removeEnd(3);
        

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(9);
        printll();
        System.out.println(Palindrom());

    // // add the element 
    //     ll.head = new Node(3);
    //     ll.head.next = new Node(3);
    // //we are not adding like that concider the function ti add , sub ,remove , print
    }
}
