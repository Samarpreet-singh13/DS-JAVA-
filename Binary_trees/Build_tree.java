package Binary_trees;

public class Build_tree {
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

    static class BinaryTree{
        static int idx=-1;

        public Node buildTree(int nodes[]){
            idx++;
            if (idx >= nodes.length) {
                return null;
            }
            if (nodes[idx]==-1) {
                return null;
            }

            Node newnode=new Node(nodes[idx]);
            newnode.left=buildTree(nodes);  
            newnode.right=buildTree(nodes);

            return newnode;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,3,2,7,6,5,4};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);

        System.out.println(root.data);
    }
}
