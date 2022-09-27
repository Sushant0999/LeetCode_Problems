//Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/

public class Best_Time_to_Buy_and_Sell_Stock {

    //Driver Code

    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minsofar = prices[0];
        for(int i = 0; i < prices.length; i++){
            minsofar = Math.min(minsofar,prices[i]);
            int profit = prices[i] - minsofar;
            maxprofit = Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}
