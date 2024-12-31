package Array_list;
import java.util.*;
public class PairsumOptimizd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int si=0;
        int ei=list.size()-1;
        int target=10;
        while (si<ei) {
            if (list.get(si)+list.get(ei)<target) {
                si++;
            }
            else{
                ei--;
            }
            if (list.get(si)+list.get(ei)==target) {
                System.out.println(list.get(si)+" and "+list.get(ei)+" will give the desired pair sum");
            }
            
        }
    }
}
