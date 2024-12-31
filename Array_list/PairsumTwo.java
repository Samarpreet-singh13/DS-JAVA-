package Array_list;

import java.util.ArrayList;

public class PairsumTwo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int bp=0;
        for (int index = 0; index < list.size()-1; index++) {
            if (list.get(index)>list.get(index+1)) {
                bp=index;
                break;
            }
        }
        int si=bp+1;
        int ei= bp;
        int target=10;
        while (si!=ei) {
            if (list.get(si)+list.get(ei)==target) {
                System.out.println(list.get(si)+" and "+list.get(ei)+" will give the desired pair sum");
                return;
            }
            if (list.get(si)+list.get(ei)<target) {
                si=(si+1)%list.size();
            }
            else{
                ei=(ei-1+list.size())%list.size();
            }
            
        }
        }
    }

