package BST;

public class ClosestToKey {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static int min=Integer.MAX_VALUE;
    public static int closest_key=-1;
    public static void closest(Node root,int key){
        if(root==null){
            return;
        }
        if(root.data==key){
            System.out.println(root.data);
            return;
        }
        if (min>root.data-key) {
            min=Math.abs(root.data-key);
            closest_key=root.data;
        }
        if (root.data<key) {
            closest(root.right,key);
        }else{
            closest(root.left,key);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(9);
        root.left = new Node(4);
        root.right = new Node(17);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(7);
        root.right.right = new Node(22);
        root.right.right.left = new Node(20);

        int key = 18;
        closest(root, key);
        System.out.println("The closest value to " + key + " is: " + closest_key);
    }
}
