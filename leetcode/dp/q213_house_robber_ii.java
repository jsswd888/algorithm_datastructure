class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        // base case
        if (nums == null || n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        }
        
        // normal case: utilize the helper method; similar to the first rob leetcode we write
        return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));
    }

    private int rob(int[] nums, int first, int last) {
        int pre2 = 0, pre1 = 0;
        for (int i = first; i <= last; i++) {
            int cur = Math.max(pre1, pre2 + nums[i]);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
}