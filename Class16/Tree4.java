import java.util.ArrayList;
public class Tree4 {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static void kLevel(Node root ,int l, int k){  // calculate the Klevel elelement
        if(root == null){
            return ;
        }
        if(l== k){
            System.out.println(root.data);
            return;
        }
        kLevel(root.left, l+1, k);
        kLevel(root.right, l+1, k);

    }

    // Lower common Ancestor 
    public static Boolean getPath(Node root,int n , ArrayList<Node> list){
        if(root == null){
            return false;
        }

        list.add(root);

        if(root.data == n){
            return true;
        }

        Boolean subL= getPath(root.left, n, list);
        Boolean subR = getPath(root.right, n, list);

        if(subL || subR){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }

    public static Node lca(Node root , int n1, int n2 ){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        int i =0 ;
        for(;i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }   
        return path1.get(i-1);


    }

    public static int dis(Node root , int n){  //distance between nodes
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftVal = dis(root.left, n);
        int rightVal = dis(root.right, n);

        if(leftVal == -1 && rightVal == -1){
            return -1;
        }else if(leftVal == -1){
            return rightVal+1;
        }else{
            return leftVal+1;
        }

    }
    public static int minData(Node root , int n1, int n2){

        Node lac = lca(root, n1, n2);
        int dia1 = dis(lac , n1);
        int dia2 = dis(lac , n2);

        return dia1+dia2;

    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //kLevel(root, 1, 2);  // caluculate the level element 

        System.out.println(minData(root, 01, 03));  //distance between two node ;



        System.out.println(lca(root, 07, 04).data);  // 
    }
}
