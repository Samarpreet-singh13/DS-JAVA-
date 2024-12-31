package Greedy;
import java.util.*;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        int amount=1235;
        int count=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i]<=amount) {
                while (coins[i]<=amount) {
                    count++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }
        System.out.println(count);
        for (int index = 0; index < ans.size(); index++) {
            System.out.print(ans.get(index)+" "); 
        }
    }
}
