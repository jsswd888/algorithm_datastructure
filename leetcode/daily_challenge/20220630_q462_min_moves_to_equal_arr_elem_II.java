class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int median = n % 2 == 1 ? nums[n/2] : (nums[(n+1)/2] + nums[(n-1)/2]) / 2;
        int res = 0;
        
        for(int i = 0; i < n; i++){
            res += Math.abs(median - nums[i]);
        }
        
        return res;
    }
}