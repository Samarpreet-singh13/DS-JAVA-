package Linked_List;

public class DoublyLL {
    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

        public void addfirst(int data){
            Node newNode=new Node(data);

            if (head==null) {
                head=tail=newNode;
                return;
            }


            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }

        public void addlast(int data){
            Node newNode=new Node(data);

            if (head==null) {
                head=tail=newNode;
                return;
            }

            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        public int removeFirst(){
            int val=head.data;
            if (head==null) {
                return val;
            }
            if (size==1) {
                head=tail;
                return val;
            }

            head=head.next;
            head.prev=null;
            return val;
        }
        public int removeLast(){
            int val=head.data;
            if (head==null) {
                return val;
            }
            if(size==1){
                head=tail;
                return val;
            }

            tail=tail.prev;
            tail.next=null;

            return val;
        }

        public void print(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        
    public static void main(String[] args) {
        DoublyLL LL=new DoublyLL();
        LL.addfirst(2);
        LL.print();
        LL.addfirst(1);
        LL.print();
        LL.addfirst(0);
        LL.print();
        LL.addlast(3);
        LL.print();
        LL.removeFirst();
        LL.print();
        LL.removeLast();
        LL.print();
        
    }
}
