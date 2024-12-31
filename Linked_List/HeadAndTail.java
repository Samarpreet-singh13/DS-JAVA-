package Linked_List;

public class HeadAndTail {
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        // HeadAndTail LL= new HeadAndTail();
        // LL.head=new Node(1);
        // LL.head.next=new Node(2);
    }
}
