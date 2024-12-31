package Stacks;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node (int d){
            data=d;
            this.next = null;
        }
    }

    static class Stack{
        static Node head;

        public boolean isEmpty(){
          return head==null;
        }

        public void push(int data){
            Node newnode = new Node(data);
            if (isEmpty()) {
                head=newnode;
                return;
            }

            newnode.next=head;
            head=newnode;
        }

        public int pop(){
            if (isEmpty()) {
                return -1;
            }

            int val=head.data;
            head=head.next;
            return val;
        }

        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(3);
        s.push(2);
        s.push(1);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
