package Binary_trees;

public class Univalued {
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
        public static boolean isUnivalued(Node root,int n){
            if (root==null) {
                return true;
            }
            
            boolean left=isUnivalued(root.left, n);
            boolean right=isUnivalued(root.right, n);

            if (root.data!=n||right!=true||left!=true) {
                return false;
            }
            return true;

        }
     public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(2);
        root.right=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(2);
        root.right.left=new Node(2);
        root.right.right=new Node(2);
        System.out.println(isUnivalued(root,root.data));
    }    
}
