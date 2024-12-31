package Array_list;

import java.util.ArrayList;

public class Multidimension {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        for (int index = 0; index < mainList.size(); index++) {
            ArrayList<Integer> currlist=mainList.get(index);
            for (int i = 0; i < currlist.size(); i++) {
                System.out.print(currlist.get(i)+" ");
            }
            System.out.println();
        }
    }
}
