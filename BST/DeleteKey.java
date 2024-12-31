package BST;

public class DeleteKey {
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
    public static Node delete(Node root,int val){
        if (root.data>val) {
            root.left=delete(root.left, val);
        }else if (root.data<val) {
            root.right=delete(root.right, val);
        }else{
            // no child
            if (root.right==null&&root.left==null) {
                return null;
            }
            // 1 child
            if (root.left==null) {
                return root.right;
            }else if (root.right==null) {
                return root.left;
            }
            // 2 child
            Node IS= inordersuccesor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inordersuccesor(Node root){
        while (root.left!=null) {
            root=root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int val[]={7,10,5,9,8,4,1,2,3,6};
        Node root=null;

        for (int i = 0; i < val.length; i++) {
           root= insert(root, val[i]);
        }

        inorder(root);
        System.out.println();

        delete(root, 7);
        inorder(root);
    }
}
