package Heaps;

import java.util.ArrayList;

public class Remove {
        public static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x=arr.size()-1;//child index
            int par=(x-1)/2;//parent index

            while (x>0&&arr.get(x)<arr.get(par)) {
            //swap
            int temp=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp); 
            x=par;
            par=(x-1)/2;
        }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIx=i;

            if (left<arr.size()&&arr.get(minIx)>arr.get(left)) {
                minIx=left;
            }            
            if (right<arr.size()&&arr.get(minIx)>arr.get(right)) {
                minIx=right;
            }

            if (minIx!=i) {
                // swap
                int temp=arr.get(i);
                arr.set(i,arr.get(minIx));
                arr.set(minIx,temp);    

                heapify(minIx);
            }
        }
        public int remove(){
            int data=arr.get(0);

            // step1- swap last element with the first element
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step2- delete removing last elemnt after swapping
            arr.remove(arr.size()-1);

            // step3- heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(4);
        h.add(3);
        h.add(6);
        h.add(1);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
