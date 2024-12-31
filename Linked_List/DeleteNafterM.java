package Linked_List;
public class DeleteNafterM {
    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void deletion(Node head,int m,int n){
        Node curr=head;
        Node t=head;

        int count ;
        while (curr!=null) {
            for (count = 1; count < m&& curr != null; count++) {
                curr=curr.next;
            }
            if (curr==null) {
                return;
            }
            t=curr.next;
            for ( count = 1; count <=n&& t != null; count++) {
                t=t.next;
            }
            curr.next=t;

            curr=t;
        }
    }
    public void add(int data){
        Node newnode= new Node(data);

        if (head==null) {
            head = tail = newnode;
            return;
        }

        tail.next=newnode;

        tail=newnode;
    }

    public void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DeleteNafterM list= new DeleteNafterM();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.deletion(head, 2, 2);
        list.print();

    }
}
