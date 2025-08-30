//package JavaClass.Class16;
import java.util.*;
//import JavaClass.Class13.Stack01.stack;

class Tree{// bild a tree for 
    static class Node{ // node making
        int data;
        Node leftNode;
        Node rightNode;
        public Node(int data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    static class Tress{
        static int ind = -1;
        public static Node bildTree(int arr[]){ // build a Tree timeComplaxcity = O(n)
            ind++;
            if(arr[ind]== -1){
                return null;
            }
            Node newNode = new Node(arr[ind]);
            newNode.leftNode = bildTree(arr);
            newNode.rightNode = bildTree(arr);
            return newNode;

        }

        public static void preOrder(Node root){ //preOrder takeing root and leftroot , rightroot time complexity = 0(n)
            if(root == null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data +" ");
            preOrder(root.leftNode);
            preOrder(root.rightNode);
        }

        public static void inOrder(Node root){   // inOrder teversal  time complexcity 0(n) leftroot , root and rigthroot 
            if(root == null){
                return;
            }
            inOrder(root.leftNode);
            System.out.println(root.data);
            inOrder(root.rightNode);
        }


        public static void printPostOrder(Node root){  // postOrder teversal time complexcity 0(n) leftOrder , ringht order ,root 
            if(root == null){
                return;
            }
            printPostOrder(root.leftNode);
            printPostOrder(root.rightNode);
            System.out.println(root.data);
        }

        public static void LavelOrder(Node root){   // lavel order teversal TC 0(n)
            if(root == null){
                return ;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curreNode = q.remove();

                if(curreNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curreNode.data);
                    if(curreNode.leftNode != null){
                        q.add(curreNode.leftNode);
                    }
                    if(curreNode.rightNode != null){
                        q.add(curreNode.rightNode);
                    }
                }
            }
    
        }
        public static int treeSize(Node root){
            if(root == null){
                return 0;
            }
                int lh = treeSize(root.leftNode);
                int rh = treeSize(root.rightNode);
                return Math.max(lh,rh)+1;
            }
        public static int countTree(Node root) {
            if(root == null) return 0;

            int lc = countTree(root.leftNode);
            int rc = countTree(root.rightNode);
            return lc+rc+1;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,4,3,55};
        Tress t = new Tress();
        Node root = t.bildTree(arr);
        //System.out.println(root.data);

        // t.preOrder(root);

        //t.inOrder(root);

        // t.printPostOrder(root);

        //  t.LavelOrder(root);

         //System.out.println(t.treeSize(root));

         System.out.println(t.countTree(root));
    }
}