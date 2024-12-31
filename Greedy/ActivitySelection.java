package Greedy;

import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        ArrayList<Integer> ans = new ArrayList<>();


        // if the arrays are not sorted then 
        // int activities[][]=new int[start.length][3];
        // for (int i = 0; i < activities.length; i++) {
        //     activities[i][0]=i;
        //     activities[i][1]=start[i];
        //     activities[i][2]=end[i];
        // }
        // Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        // int maxAct = 0;
        // maxAct = 1;
        // int lastend = activities[0][2];
        // ans.add(activities[0][0]);
        // for (int i = 1; i < end.length; i++) {
        //     if (activities[i][1] >= lastend) {
        //         maxAct++;
        //         ans.add(activities[i][0]);
        //         lastend = activities[i][2];
        //     }
        // }

        int maxAct = 0;
        maxAct = 1;
        int lastend = end[0];
        ans.add(0);
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastend) {
                maxAct++;
                ans.add(i);
                lastend = end[i];
            }
        }

        System.out.println("Max activities are:" + maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
