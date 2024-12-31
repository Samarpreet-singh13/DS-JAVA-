package Binary_trees;

public class DiameterOne {
    static class Node{
        int data;
        Node left; 
        Node right;
        
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if (root==null) {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }
    // this approach have the time complexity of O(n^2) as the O(n) work is done on all n nodes 
    public static int diameter(Node root){
        if (root == null) {
            return 0;
        }

        int leftdiam=diameter(root.left);
        int lh=height(root.left);
        int rightdiam=diameter(root.right);
        int rh=height(root.right);

        int self=rh+lh+1;

        return Math.max(rightdiam, Math.max(leftdiam, self));
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        int diam= diameter(root);
        System.out.println(diam);
    }
}
