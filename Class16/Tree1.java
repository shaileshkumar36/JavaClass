public class Tree1 {

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
    public static int countTree(Node root){
        if(root == null){
            return 0;
        }
        int lh = countTree(root.left);
        int rh = countTree(root.right);
        return lh+rh +1;

    }

    public static int addAllNode(Node root){
        if(root == null){
            return 0;
        }
        int ld = addAllNode(root.left);
        int rd = addAllNode(root.right);
        return ld+rd+root.data;
    }
    public static int heigh(Node root){
        if(root == null){
            return 0;
        }
        int lh = heigh(root.left);
        int rh = heigh(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int dimeter(Node root){
        if(root == null){
            return 0;
        }

        int ld = dimeter(root.left);
        int rd = dimeter(root.right);

        int lh = heigh(root.left);
        int rh = heigh(root.right);
        int selfdiam = lh+rh +1;
        return Math.max(ld, Math.max(rd,selfdiam));
    }


    public static void main(String args[]){
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
        root.left.left.left = new Node(8);

        //System.out.println(countTree(root));

        //System.out.println(addAllNode(root));

        System.out.println(dimeter(root));
    }
}
