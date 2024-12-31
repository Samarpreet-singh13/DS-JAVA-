package Linked_List;

public class IntersectionPT {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public Node getpoint(Node h1, Node h2) {
        while (h2 != null) {
            Node temp = h1;
            while (temp != null) {
                if (h2 == temp) {
                    return h2;
                }
                temp = temp.next;
            }
            h2 = h2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        IntersectionPT LL=new IntersectionPT();
        Node head1;
        Node head2;
        head1 = LL.new Node(10);
        head2 = LL.new Node(3);

        Node newNode = LL.new Node(6);
        head2.next = newNode;
        newNode = LL.new Node(9);
        head2.next.next = newNode;
        newNode = LL.new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = LL.new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;
        Node intersection = LL.getpoint(head1, head2);
        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
