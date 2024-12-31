package Queues;
import java.util.*;

public class DequeQ {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        dq.removeLast();
        dq.removeFirst();
        System.out.println(dq);
        System.out.println(dq.getLast());
    }
}