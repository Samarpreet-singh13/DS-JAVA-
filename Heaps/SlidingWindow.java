package Heaps;
import java.util.*;
public class SlidingWindow {
    static class Pair implements Comparable<Pair>{
        int val,idx;
        Pair(int val,int idx){
            this.idx=idx;
            this.val=val;
        }
        @Override
        public int compareTo(Pair p2){
            // to create a max heap and sorting in descending order
            return p2.val-this.val;
        }
    }
    public static void main(String arge[]){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int[arr.length-k+1];

        PriorityQueue<Pair>pq=new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i],i));
        }

        res[0]=pq.peek().val;

        for (int i = k; i < arr.length; i++) {
            while (pq.size()>0&&pq.peek().idx<=(i-k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1]=pq.peek().val;                                                                   
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
