package Queues;
import java.util.*;
public class UsingJCF {
    public static void main(String[] args) {
        Queue <Integer> q= new LinkedList<>();//ArrayDeque can be used instead of linkedlist
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
