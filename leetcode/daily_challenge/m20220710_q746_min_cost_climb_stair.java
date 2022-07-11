class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // can either start from index 0 / 1; each time can only forward 1 / 2 steps 
        // so, each time, we can increment the current position num.
        // with the smaller one in previous two, which ensures each time we are choosing
        // the optimal choice.
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        
        // when we finish iterating the who arr, we can imaging that we still need to 
        // make decision: add a num. at cost[cost.length] position
        
        // the smaller of the last two is the minimum sum we want to return
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}