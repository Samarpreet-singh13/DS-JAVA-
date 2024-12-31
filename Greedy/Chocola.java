package Greedy;
// import java.util.*;
public class Chocola {
    public static void main(String[] args) {
        Integer costver[]={2,1,3,1,4};
        Integer costhor[]={4,1,2};

        // Sort in the descending ordr
        // Arrays.sort(costhor,Collections.reverseOrder());
        // Arrays.sort(costver,Collections.reverseOrder());

        // pointers to traverse over the arrays
        int h=0;
        int v=0;

        // keeping a track of the no pf peices 
        int hp=1;
        int vp=1;

        int cost=0;

        while (h<costhor.length&&v<costver.length) {
            if (costver[v]<=costhor[h]) {
                cost+=costhor[h]*vp;
                h++;
                hp++;
            }else{
                cost+=costver[v]*hp;
                v++;
                vp++;
            }
        }

        // making the cuts on the left out pieces
        while (h<costhor.length) {
            cost+=costhor[h]*vp;
            h++;
            hp++;
        }

        while (v<costver.length) {
            cost+=costver[v]*hp;
            v++;
            vp++;  
        }

        System.out.println("Minimum cost="+cost);
    }
}
