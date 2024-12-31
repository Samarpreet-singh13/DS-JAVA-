package Array_list;
import java.util.*;
public class PairsumBrute {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Scanner sc= new Scanner(System.in);
        int target =sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i)+list.get(j)==target) {
                    System.out.println(list.get(i)+" and "+list.get(j)+" will give the desired pair sum");
                }
            }
            // System.out.println();
        }

        sc.close();
    }
}
