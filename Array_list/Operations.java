package Array_list;

import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        int element =list.get(3);
        System.out.println(element);

        list.remove(3);
        System.out.println(list);
        
        list.set(4, 99);
        System.out.println(list);

        System.out.println(list.contains(99));

        System.out.println(list.size());
    }
}
