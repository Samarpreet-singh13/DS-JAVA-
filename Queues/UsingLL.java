package Queues;

public class UsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Queues{
        public static Node head;
        public static Node tail;
        public boolean isEmpty(){
            return head==null&&tail==null;
        }

        public int peek(){
            return head.data;
        }
        public void add(int data){
            Node newnode=new Node(data);
            if (head==null) {
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;   
        }

        public int remove(){
            if (isEmpty()) {
                return-1;
            }
            int front=head.data;
            if (head==tail) {
                head=tail=null;

            }else{
                head=head.next;
            }
            return front;
        }
    }
    public static void main(String[] args) {
        Queues q=new Queues();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
