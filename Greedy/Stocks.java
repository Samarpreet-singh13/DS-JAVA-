package Greedy;

public class Stocks {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};

        int buyprice=prices[0];
        int max_profit=0;

        for (int i = 1; i < prices.length; i++) {
            if (buyprice>prices[i]) {
                buyprice=prices[i];
            }
            if (prices[i]-buyprice>max_profit) {
                max_profit=prices[i]-buyprice;
            }
        }
        System.out.println(max_profit);
    }
}
