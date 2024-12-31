package Binary_trees;

public class MaximumPath {
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
    public static int maxpath(Node root){
        if (root==null) {
            return 0;
        }

        int left=maxpath(root.left);
        int right=maxpath(root.right);

        // int max_root=Math.max(left+root.data, right+root.data);
        // return Math.max(max_root, Math.max(left, right));
        int maxRoot = Math.max(root.data, Math.max(left + root.data, right + root.data));

        // Calculate the maximum path sum overall
        int maxPathSum = Math.max(maxRoot, left + right + root.data);

        return maxPathSum;
    }
    public static void main(String[] args) {
        Node root=new Node(-10);
        root.left=new Node(13);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        System.out.println(maxpath(root));
    }
}
