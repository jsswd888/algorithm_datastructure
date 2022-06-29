class Solution {
    public int maxProfit(int[] prices) {
        int curr_diff = 0;
        int curr_min = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] - curr_min > curr_diff){curr_diff = prices[i] - curr_min;}
            curr_min = Math.min(curr_min, prices[i]);
        }
        
        return curr_diff;
    }
}