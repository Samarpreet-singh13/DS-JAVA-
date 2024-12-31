package Linked_List;

public class MergeSort {
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

    public Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1,Node head2){
        Node newnNode=new Node(-1);
        Node temp=newnNode;
        while (head1!=null&&head2!=null) {
            if (head1.data<=head2.data) {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while (head1!=null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }

        while (head2!=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return newnNode.next;
    }
    public Node sort(Node head){
        if (head==null||head.next==null) {
            return head;
        }

        Node mid=getmid(head);
        Node righthead=mid.next;
        mid.next=null;
        Node newLeft=sort(head);
        Node newRight=sort(righthead);

        return merge(newLeft,newRight);
    }
    public static void main(String[] args) {
        MergeSort LL= new MergeSort();
        LL.addlast(3);
        LL.addfirst(1);
        LL.addfirst(2);
        LL.addlast(4);  
        LL.print();

        head=LL.sort(head);
        LL.print();
    }
}
