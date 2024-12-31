package Linked_List;

public class SwapNodes {
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

    public void swaping(int x,int y){
        if (x==y) {
            return;
        }

        Node prevX=null;
        Node currX=head;

        while (currX!=null&&currX.data!=x) {
            prevX=currX;
            currX=currX.next;
        }

        Node prevY=null;
        Node currY=head;
        while (currY!=null&&currY.data!=y) {
            prevY=currY;
            currY=currY.next;
        }

        // if any node containig one value is not found then the swap is not done 
        if (currX==null||currY==null) {
            return;
        }

        if (prevX!=null) {
            prevX.next=currY;
        }else{
            head=currY;
        }
        if (prevY!=null) {
            prevY.next=currX;
        }else{
            head=currX;
        }

        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
        
    }
    public static void main(String[] args) {
        SwapNodes list=new SwapNodes();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();

        list.swaping(3, 5);
        list.print();
    }
}
