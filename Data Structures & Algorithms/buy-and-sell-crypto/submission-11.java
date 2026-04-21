class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int buy = 0;
        int sell = 1;

        for(int i = 1; i < prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            if(prices[sell] < prices[buy]){
                buy = sell;
            }
            sell++;
        }

        return maxProfit;

    }
}
