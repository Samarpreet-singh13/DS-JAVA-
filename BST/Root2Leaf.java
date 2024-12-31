package BST;
import java.util.*;
public class Root2Leaf {
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
    public static void printpath(ArrayList<Integer>path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void root2leafpath(Node root,ArrayList<Integer> path){
        if (root==null) {
            return;
        }
        path.add(root.data);
        if (root.left==null&&root.right==null) {
            printpath(path);
        }
        root2leafpath(root.left, path);
        root2leafpath(root.right, path);
        path.remove(path.get(path.size()-1));
    }

    public static void main(String[] args) {
        int val[]={8,5,1,3,6,10,11,14};
        Node root=null;

        for (int i = 0; i < val.length; i++) {
           root= insert(root, val[i]);
        }

        inorder(root);
        System.out.println();
        root2leafpath(root, new ArrayList<>());
    }
}
