package Linked_List;

import java.util.LinkedList;

public class In_built {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.addFirst(12);
        LL.add(123456);
        LL.addLast(98);
        System.out.println(LL);

        LL.removeFirst();
        LL.removeLast();        
        System.out.println(LL);
    }
}
