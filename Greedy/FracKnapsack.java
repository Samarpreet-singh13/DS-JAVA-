package Greedy;

import java.util.Arrays;
import java.util.Comparator;
public class FracKnapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        double ratio[][]=new double[val.length][2];

        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity=w;
        int finalval=0;

        for (int i = val.length-1; i >= 0; i--) {
            int idx=(int)ratio[i][0];
            if (capacity>=weight[idx]) {
                finalval=finalval+val[idx];
                capacity=capacity-weight[idx];
            }else{
                finalval+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println(finalval);
    }
}
