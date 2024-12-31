package Heaps;
import java.util.*;
public class HeapsInsert {
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
    }
    public static void main(String []args){
        // Heap h=new Heap();

    }
}
