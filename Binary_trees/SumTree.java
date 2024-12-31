package Binary_trees;

public class SumTree {
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
    public static int transform(Node root){
        if (root==null) {
            return 0;
        }

        int leftchild=transform(root.left);
        int rightchild=transform(root.right);

        // checking the case when we are at the leaf node and converting the data from null to 0 or valid 
        int newleft=root.left==null?0:root.left.data;
        int newright=root.right==null?0:root.right.data;

        int data=root.data;
        // the sum in both the subtrees and the child of the root (whole tree) 
        root.data=newleft+leftchild+rightchild+newright;
        return data;//returning the data bcoz we have to remove the topmost data and update it with the new data arriving from the childs 
    }
    public static void preorder(Node root){
        if (root==null) {
            return ;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        transform(root);

        preorder(root);
    }
}
