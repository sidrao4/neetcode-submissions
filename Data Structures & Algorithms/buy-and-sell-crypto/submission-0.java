class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int l = 0;
        for(int r = 1; r<prices.length; r++){
            if(prices[r]-prices[l]<0) l = r;
            else profit = Math.max(profit, prices[r]-prices[l]);
        }
        return profit;
    }
}
