package JavaClass.Class14;

public class Queue1 {
    static int arr[] ;
    static int size;
    static int rear;
    static int front;

    static class Queue{

        public Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static Boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static Boolean isFull(){
            return (rear +1)%size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("jgha nhi ha ");
                return ;
            }
            if(front == -1){
                front = 0;
            }

            rear =( rear +1)% size;
            arr[rear] = data;

        }
        public static int remove(){
            if(isFull()){
                System.out.println("jagha nhi ha ");
                return -1;
            }
            int value = arr[front];
            if(front == rear){
                front = rear = -1 ;
            }
            else{

                front = (front+1)%size;
            }
            return value;
        }

        public static int peek(){
            if(isEmpty()){
             System.out.println("khale ha ");  
             return -1; 
            } 
            return arr[front];
        }

    }

    public static void main(String arga[]){
        Queue q = new Queue(9);
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove() ;
       }

    }
}
