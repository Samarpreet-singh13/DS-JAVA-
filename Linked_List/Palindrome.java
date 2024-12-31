package Linked_List;

public class Palindrome {
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
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean ispalindrome(){
        if (head==null||head.next==null) {
            return true;
        }

        // step 1- find mid index
        Node mid=findmid(head);  
        
        // step 2- revesre the half after mid
        Node prev=null;
        Node curr=mid;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        // step 3- compairing both the halves 
        while (right!=null) {
            if (left.data!=right.data) {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome LL = new Palindrome();
        LL.addfirst(2);
        LL.addfirst(1);
        LL.addlast(2);
        LL.addlast(3);  
        LL.print();
        System.out.println(LL.ispalindrome());
    }
}
