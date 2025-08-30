//package JavaClass.Class16;

import java.util.*;

public class Tree2 {

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

    public static boolean isIentical(Node nood , Node subRoot){
        if(nood == null && subRoot == null){
            return true;
        }else if(nood == null || subRoot == null || nood.data != subRoot.data){
            return false;
        }
        if(!isIentical(nood.left, subRoot.left)){
            return false;
        }
        if(!isIentical(nood.right, subRoot.right)){
            return false;
        }
        return true;

    }

    public static boolean isSubtree(Node root,Node subRoot) {
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        //subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));  

    }
}
