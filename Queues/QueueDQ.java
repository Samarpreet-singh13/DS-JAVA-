package Queues;
import java.util.*;
public class QueueDQ {
    static class Queue{
        Deque<Integer>dq=new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }
        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
    }
}
