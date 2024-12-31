package Heaps;
import java.util.*;
public class PriorityQueues {
    public static void main(String[] args) {
        // below will store the elememnt in the ascending order
        // PriorityQueue<Integer> pq=new PriorityQueue<>();

        // the below pq will store the data in descending order 
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(5);//add operation takes O(logn) tc
        pq.add(8);
        pq.add(3);
        pq.add(1);

        // pq.remove();it will take O(log n) tc 
        // pq.peek();it will take only o(1) tc
        System.out.println(pq);
    }
}