import java.util.*;

public class Tree3 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class info{
        Node root;
        int HD;
        public info(int HD  ,Node root){
            this.root = root;
            this.HD = HD;
        }
    }

    public static void topVieu(Node root){
        Queue<info> q = new LinkedList<>();
        
    }


    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

    }
}
