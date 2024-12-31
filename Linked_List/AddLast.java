package Linked_List;

public class AddLast {
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

    public void add(int data){
        Node newnode= new Node(data);

        if (head==null) {
            head = tail = newnode;
            return;
        }

        tail.next=newnode;

        tail=newnode;
    }

    public static void main(String[] args) {
        AddLast LL= new AddLast();
        LL.add(1);
        LL.add(2);
    }
}
