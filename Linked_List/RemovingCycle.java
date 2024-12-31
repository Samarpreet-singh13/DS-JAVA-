package Linked_List;

public class RemovingCycle {
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

    public void addfirst(int data){
        Node newnode=new Node(data);
        if (head==null) {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(int data){
        Node newnode= new Node(data);
        if (head==null) {
            head = tail = newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        if (head==null) {
            System.out.println("empty linked list");
        }

        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static boolean isCyclic(){
        Node slow=head;
        Node fast=head;

        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow) {
                return true;
            }
        }
        return false;
    }
    public static void removecycle(){
        // step 1 - check if it is cyclic or not
        Node slow=head;
        Node fast=head;
        boolean cyclic=false;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow) {
                cyclic=true;
                break;
            }
        }
        if (cyclic) {
            slow=head;
        }

        // step 2 - find the last node 
        Node prev= null;
        while (fast!=slow) {
            prev=fast;
            fast=fast.next;
            slow=slow.next;
        }

        // step 3 - break the link
        prev.next=null;
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(3);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(isCyclic());
        removecycle();
        System.out.println(isCyclic());
    }
}
