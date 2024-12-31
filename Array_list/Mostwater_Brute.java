package Array_list;

import java.util.*;
public class Mostwater_Brute {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
         
        // time complexity is O(n^2) hence we will use another method for better optimization
        int maxwater=0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                int currwater=(j-i)*(Math.min(list.get(i), list.get(j)));
                maxwater=Math.max(maxwater, currwater);
            }
        }
        System.out.println(maxwater);
    }


}
