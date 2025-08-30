package JavaClass.Class14;

public class Queue0 {

    static int arr[];
    static int size;
    static int rear;


    static class Queue1{
        public Queue1(int n){
            size = n;
             arr = new int[n];
            rear = -1;
        }

        // if emty queue;
        public static Boolean isEmty(){
            return rear == -1;
        }

        // add function
        public static void add(int data){

            if(rear == size-1){
                System.out.println("jaha nhi  ha");
                return;
            }
            rear = rear +1;
            arr[rear] = data;
        }

        //remove 
        public static int remove(){
            if(rear == -1){
                System.out.println("statck is empty"
                );
                return -1;

            }
            int forent = arr[0];

            for(int  i =0;i<rear;i++){
                arr[i] = arr[i+1];

            }
            rear -=1;
            return forent;

        }
        
        public static int peek(){
             if(rear == -1){
                System.out.println("statck is empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String arr[]){
       
        Queue1 q = new Queue1(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
