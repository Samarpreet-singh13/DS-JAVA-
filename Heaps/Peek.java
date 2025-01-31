package Heaps;

import java.util.ArrayList;

public class Peek {
        public static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x=arr.size()-1;//child index
            int par=(x-1)/2;//parent index

            while (arr.get(x)<arr.get(par)) {
            //swap
            int temp=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp); 
            }
            x=par;
            par=(x-1)/2;
        }
        public int peek(){
            return arr.get(0);
        }
    }
}
