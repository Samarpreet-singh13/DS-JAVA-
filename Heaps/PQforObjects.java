package Heaps;
import java.util.*;
public class PQforObjects {
    static class Student implements Comparable<Student>{
            int rank;
            String name;
            Student(int rank,String name){
                this.name=name;
                this.rank=rank;
            }
            @Override 
            public int compareTo(Student s2) {
                return this.rank-s2.rank;
                //this lines shows how the data will be sorted according to the rank. As the line says this.rank-s2.rank it will have data in ascending order and s2.rank-this.rank will sort the data in the descending value of the rank
            }
    }

    public static void main(String[] args) {
        PriorityQueue<Student>pq=new PriorityQueue<>();
        pq.add(new Student(9,"A"));
        pq.add(new Student(2,"B"));
        pq.add(new Student(4,"C"));
        pq.add(new Student(1,"D"));
        pq.add(new Student(10,"E"));
        
        while(!pq.isEmpty()){
            System.out.println(pq.remove().rank);
        }
    }
}
