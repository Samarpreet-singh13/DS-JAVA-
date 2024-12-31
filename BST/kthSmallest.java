package BST;

import java.util.*;

public class kthSmallest {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void getinorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        getinorder(root.left, list);
        list.add(root.data);
        getinorder(root.right, list);
    }

    public static int findsmall(ArrayList<Integer> list, int k) {
        if (k > list.size()) {
            return -1;
        } else {
            return list.get(k - 1);
        }

    }

    public static Node insert(Node root, int x) {
        if (root == null)
            return new Node(x);
        if (x < root.data)
            root.left = insert(root.left, x);
        else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }

    public static int smallest(Node root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        getinorder(root, list);

        int data = findsmall(list, k);
        return data;
    }

    public static void main(String[] args) {
        Node root = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
        for (int x : keys)
            root = insert(root, x);
        int k = 1;
        System.out.println(smallest(root, k));
    }
}
