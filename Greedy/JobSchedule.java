package Greedy;
import java.util.*;
public class JobSchedule {
    static class Jobs{
        int deadline;
        int profit;
        int id;

        Jobs(int d,int p,int id){
            this.deadline=d;
            this.profit=p;
            this.id=id;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Jobs> job=new ArrayList<>();
        
        for (int i = 0; i < jobInfo.length; i++) {
            job.add(new Jobs(jobInfo[i][0], jobInfo[i][1], i)) ;       
        }
        Collections.sort(job,(o1,o2)->o2.profit-o1.profit);
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;

        for (int i = 0; i < job.size(); i++) {
            Jobs curr=job.get(i);
            if (curr.deadline>time) {
                time++;
                seq.add(curr.id);
            }
        }

        System.out.println("Max jobs ="+seq.size());

        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i)+" ");
        }
    }
}
