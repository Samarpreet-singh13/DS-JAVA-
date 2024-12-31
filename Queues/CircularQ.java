package Queues;

public class CircularQ {
    static class Queues{
        public static int arr[];
        public static int size;
        public static int front;
        public static int rear;

        Queues(int n){
            arr=new int[n];
            rear=-1;
            front=-1;
            size=n;
        }
        public boolean isEmpty(){
            return rear==-1&&front==-1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }
        public int peek(){
            return arr[front];
        }
        public void add(int data){
            if (isFull()) {
                System.out.println("Full");
                return;
            }
            if (front==-1) {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        public int remove(){
            if (isEmpty()) {
                return-1;
            }
            int result=arr[front];

            if (front==rear) {
                front=rear=-1;
            }else{
                front=(front+1)%size;
            }

            return result;
        }
    }
    public static void main(String[] args) {
        Queues q=new Queues(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
