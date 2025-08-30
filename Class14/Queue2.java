package JavaClass.Class14;

public class Queue2 {
    
    static class Node{
    int data;
    Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static Boolean isEmpty() {
            return head == null && tail == null ;
        }

        public static void add(int data){
            Node newNode = new Node( data);

            if(isEmpty()){
                head = tail = newNode;
                return ;
            }

            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("khali ha queue");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                head = tail = null;
                
            }else{
                head = head.next;
            }

            return front;

        }

}
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
