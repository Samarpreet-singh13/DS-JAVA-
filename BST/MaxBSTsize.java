package BST;

public class MaxBSTsize {
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
    static class Info{
        boolean isBST;
        int size,max,min;
        public Info(int size,int max,int min,boolean isBST){
            this.isBST=isBST;
            this.size=size;
            this.max=max;
            this.min=min;
        }
    }
    public static int maxsize=0;

    // refer to lecture in the BST folder 
    public static Info largestbst(Node root){
        if (root==null) {
            return new Info(0, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        }
        Info leftInfo=largestbst(root.left);
        Info rightInfo=largestbst(root.right);
        int size=leftInfo.size+rightInfo.size+1;
        int max=Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        int min=Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));

        if (root.data<=leftInfo.max||root.data>=rightInfo.min) {
            return new Info(size, max, min, false);
        }
        if (leftInfo.isBST&&rightInfo.isBST) {
            maxsize=Math.max(size, maxsize);
            return new Info(size,max,min,true);
        }

        return new Info(size, max, min, false);
    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.left.left=new Node(20);

        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);

        largestbst(root);
        System.out.println(maxsize);    
    }
}
