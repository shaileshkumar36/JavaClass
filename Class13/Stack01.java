package JavaClass.Class13;

public class Stack01{

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static class stack{ 
        static Node head = null;
        public static Boolean isEmty(){
            return head == null;
        }
        public static void push(int data){

            Node newNode = new Node(data);
            if(isEmty()){
                head = newNode;
                return ;

            }
            newNode.next = head;
            head = newNode;

        }

        public static int pop(){

            if(isEmty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){

            if(isEmty()) return -1;

            return head.data;
        }
    }


    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmty()){
            System.out.println(s.peek());
            System.out.println(s.pop());
            //System.out.println(s.pop()) ;
        }

    }
}