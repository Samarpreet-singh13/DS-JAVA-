package BST;

public class PrintinRange {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void inorder(Node root){
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node insert(Node root,int val){
        if (root==null) {
            return new Node(val);
        }

        if (root.data>val) {
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void print(Node root,int k1,int k2){
        if (root==null) {
            return;
        }
        if (root.data>=k1&&root.data<=k2) {
            print(root.left, k1, k2);  
            System.out.print(root.data+" ");
            print(root.right, k1, k2);
        }
        else if (root.data<k1) {
            print(root.right, k1, k2);
        }else{
            print(root.left, k1, k2);
        }
    }

    public static void main(String[] args) {
        int val[]={7,10,5,9,8,4,1,2,3,6};
        Node root=null;

        for (int i = 0; i < val.length; i++) {
           root= insert(root, val[i]);
        }
        print(root, 5, 10);
        System.out.println();
        inorder(root);
    }
}
