package Linked_List;

public class Print {
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
    public static void main(String[] args) {
        Print LL = new Print();
        LL.addfirst(2);
        LL.addfirst(1);
        LL.addlast(3);
        LL.addlast(4);  
        LL.print();
    }
}
