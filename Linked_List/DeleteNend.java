package Linked_List;

public class DeleteNend {
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

    public void delete(int n ){
        int size=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            size++;
        }
        if (n==size) {
            head=head.next; //remove first
        }

        int i =1;
        int iTofind=size-n;
        Node prev=head;
        while (i<iTofind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;

    }

    public static void main(String[] args) {
        DeleteNend LL = new DeleteNend();
        LL.addfirst(2);
        LL.addfirst(1);
        LL.addlast(3);
        LL.addlast(4);
        LL.addlast(5);
        LL.print();
        LL.delete(3);
        LL.print();
    }

}
