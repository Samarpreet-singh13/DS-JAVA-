package Binary_trees;

public class Subtree {
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
    public static boolean isIdentical(Node node,Node subnode){
        if (node==null&&subnode==null) {
            return true;
        }else if (node==null||subnode==null||node.data!=subnode.data) {
            return false;
        }

        if (!isIdentical(node.left, subnode.left)) {
            return false;
        }
        if (!isIdentical(node.right, subnode.right)) {
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subroot){
        if (root==null) {
            return false;
        }
        if (root.data==subroot.data) {
            if (isIdentical(root,subroot)) {
                return true;
            }
        }
        return isSubtree(root.left, subroot)||isSubtree(root.right, subroot);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        Node subNode=new Node(2);
        subNode.left=new Node(4);
        subNode.right=new Node(5);

        System.out.println(isSubtree(root, subNode));
    }
}
