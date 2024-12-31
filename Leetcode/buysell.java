package Leetcode;

public class buysell {
    public int maxprofit(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice<prices[i]) {
                int profit=buyprice-prices[i];
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
}
