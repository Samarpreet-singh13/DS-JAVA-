package Queues;

import java.util.*;

public class ReverseKelements {
    public static void reverse(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();

        if (q.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = 1; i <= k; i++) {
            s.push(q.remove());
        }
        for (int i = 1; i <= k; i++) {
            q.add(s.pop());
        }
        for (int i = 0; i < k-1; i++) {
            int top=q.peek();
            q.add(top);
            q.remove();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q);
        reverse(q, 4);
        System.out.println(q);
    }
}
