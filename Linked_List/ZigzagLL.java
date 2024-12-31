package Linked_List;

public class ZigzagLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        if (head == null) {
            System.out.println("empty linked list");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigzag(){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }

        Node mid = slow;

        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;

        Node LHN,RHN;

        while (left!=null&&right!=null) {
            LHN=left.next;
            left.next=right;
            RHN=right.next;
            right.next=LHN;

            left=LHN;
            right=RHN;
        }
    }

    public static void main(String[] args) {
        ZigzagLL LL=new ZigzagLL();
        LL.addfirst(2);
        LL.addfirst(1);
        LL.addlast(3);
        LL.addlast(4);  
        LL.print();

        LL.zigzag();
        LL.print();
    }
}
