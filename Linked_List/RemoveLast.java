package Linked_List;

public class RemoveLast {
    public class Node{
        int data;
        Node next;
        Node(int data ){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addlast(int data){
        Node newnode= new Node(data);
        size++;
        if (head==null) {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public int removefirst(){
        int val=head.data;
        if (head==null) {
            return Integer.MIN_VALUE;
        }
        if (size==1) {
            head=tail;
            return val;
        }
        head=head.next;
        size--;
        return val;
    }

    public void print(){
        if (head==null) {
            System.out.println("empty list");
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removelast(){
        if (head==null) {
            return Integer.MIN_VALUE;
        }
        if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        Node prev=head;
        for (int i = 0; i < size-2; i++) {
            prev=prev.next;
        }
        int val = tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        RemoveLast LL = new RemoveLast();
        LL.addlast(1);
        LL.addlast(2);
        LL.addlast(3);
        LL.addlast(4);
        LL.print();
        System.out.println("size is "+size);

        LL.removefirst();
        LL.print();
        System.out.println("Now changed size is "+size);
        LL.removelast();
        LL.print();
        System.out.println("Now changed size is "+size);
    }
}
