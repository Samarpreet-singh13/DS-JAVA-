package BST;

public class SuminRange {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
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

    public static int printsum(Node root, int k1, int k2) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.data >= k1 && root.data <= k2) {
            sum+=printsum(root.left, k1, k2);
            sum = sum + root.data;
            sum+=printsum(root.right, k1, k2);
        } else if (root.data < k1) {
            sum+=printsum(root.right, k1, k2);
        } else {
            sum+=printsum(root.left, k1, k2);
        }
        return sum;
    }

    public static void main(String [] args){
        Node root = null;
        root = insert(root, 10);
        insert(root, 5);
        insert(root, 15);
        insert(root, 3);
        insert(root, 7);
        insert(root, 18);

        System.out.println(printsum(root, 7, 15));
    }
}
