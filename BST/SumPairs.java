package BST;

import java.util.*;

public class SumPairs {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.right = this.left = null;
        }
    }

    public static int countpairs(Node root1, Node root2, int key) {
        if (root1 == null || root2 == null) {
            return 0;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        int count = 0;
        Node top1;
        Node top2;

        while (true) {
            while (root1 != null) {
                s1.push(root1);
                root1 = root1.left;
            }
            while (root2 != null) {
                s2.push(root2);
                root2 = root2.right;
            }
            
            if (s1.isEmpty() || s2.isEmpty()) {
                break;
            }
            top1 = s1.peek();
            top2 = s2.peek();
            if (top1.data + top2.data == key) {
                count++;
                s1.pop();
                s2.pop();
                root1 = top1.right;
                root2 = top2.left;
                } else if (top1.data + top2.data > key) {
                s2.pop();
                root2 = top2.left;
            } else {
                s1.pop();
                root1 = top1.right;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);
        int x = 16;
        System.out.println("Pairs = " + countpairs(root1, root2, x));
    }
}
