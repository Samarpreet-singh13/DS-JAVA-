package Binary_trees;

public class TransformMirror {
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

    static class BinaryTree {
        Node root;

        void mirror() {
            root = mirror(root);
        }

        Node mirror(Node node) {
            if (node == null) {
                return node;
            }
            Node left = mirror(node.left);
            Node right = mirror(node.right);

            node.left = right;
            node.right = left;

            return node;
        }

        void inorder() {
            inorder(root);
        }

        void inorder(Node node) {
            if (node == null) {
                return;
            }
            inorder(node.left);
            System.out.print(node.data);
            inorder(node.right);
        }
    }

    // the below code is easier and understandable
    //     public static Node mirror(Node root){
    //     if(root==null){
    //         return null;
    //     }
    //     Node left=mirror(root.left);
    //     Node right=mirror(root.right);
    //     root.left=right;
    //     root.right=left;
    //     return root;
    // }
    // public static void main(String[] args) {
    //     Node root=new Node(1);
    //     root.left=new Node(2);
    //     root.right=new Node(3);
    //     root.left.left=new Node(4);
    //     root.left.right=new Node(5);
    //     root.right.left=new Node(6);
    //     root.right.right=new Node(7);
    // root=mirror(root);
    // preorder(root);
    // }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inorder();
        System.out.println();
        tree.mirror();
        tree.inorder();

    }
}
