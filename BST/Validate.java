package BST;

public class Validate {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
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
    public static boolean isValid(Node root,Node min,Node max){
        if (root==null) {
            return true;
        }
        if (min!=null&&root.data<=min.data) {
            return false;
        }else if (max!=null&&root.data>=max.data) {
            return false;
        }
        return isValid(root.left, min, root)&&isValid(root.right, root, max);
    }
    public static void main(String[] args) {
        int val[]={1,1,1};
        Node root=null;

        for (int i = 0; i < val.length; i++) {
           root= insert(root, val[i]);
        }
        System.out.println(isValid(root, null, null));
    }
}
