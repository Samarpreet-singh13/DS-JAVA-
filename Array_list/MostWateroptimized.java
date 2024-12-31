package Array_list;

import java.util.ArrayList;

public class MostWateroptimized {
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

        int si=0;
        int ei=list.size()-1;
        int maxwater=0;
        while (si<ei) {
            if (list.get(si)<list.get(ei)) {
                si++;
            }else{
                ei--;
            }
            int currwater=(ei-si)*Math.min(list.get(si), list.get(ei));
            maxwater=Math.max(maxwater, currwater);
        }

        System.out.println(maxwater);
    }
}
