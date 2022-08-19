class Solution {
    public int rob(int[] nums) {
        // principle: each time choose: Math.max(dp[i-2] + dp[i], dp[i-1]
        int pre2 = 0, pre1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = Math.max(pre2 + nums[i], pre1);
            pre2 = pre1;
            pre1 = curr;
        }
        return pre1;
    }
}