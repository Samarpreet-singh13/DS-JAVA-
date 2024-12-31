package Binary_trees;
import java.util.*;

public class DeleteX {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void levelorder(Node root){
        if (root==null) {
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode=q.remove();
            if (currNode==null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if (currNode.left!=null) {
                    q.add(currNode.left);
                }
                if (currNode.right!=null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static boolean isLeaf(Node root){
        if (root==null) {
            return false;
        }
        if (root.left==null&&root.right==null) {
            return true;
        }
        return false;
    }
    public static Node deleteX(Node root,int x){
        if (root==null) {
            return null;
        }
        
        root.left=deleteX(root.left, x);
        root.right=deleteX(root.right, x);
        if (isLeaf(root)&&root.data==x) {
            return null;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(4);
        root.right.right=new Node(7);

        System.out.println(isLeaf(root.right));
        levelorder(root);

        deleteX(root, 4);
        levelorder(root);
    }
}
