package Linked_List;

public class AddFirst {
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
        // step 1- create new node 
        Node newnode=new Node(data);

        // if the linked list is null 
        if (head==null) {
            head=tail=newnode;
            return;
        }

        // step 2- point next of new node to head
        newnode.next=head;

        // step 3- make the added node head
        head=newnode;
    }
    public static void main(String[] args) {
        AddFirst ll=new AddFirst();

        // it will be added in O(1) time complexity
        ll.add(1);
        ll.add(2);

        // the above is added as 2->1
    }
}
