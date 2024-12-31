package Linked_List;

public class RecursiveSearch {
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
    public int helper(Node head,int key){
        if (head==null) {
            return -1;
        }
        if (head.data==key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx==-1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public static void main(String[] args) {
        RecursiveSearch LL = new RecursiveSearch();
        LL.addfirst(2);
        LL.addfirst(1);
        LL.addlast(3);
        LL.addlast(4);  
        LL.print();

        // t.c is O(n)
        System.out.println(LL.recSearch(4));
        System.out.println(LL.recSearch(5));
    }
}
