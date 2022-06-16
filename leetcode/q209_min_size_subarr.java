class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // base case
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int res = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            // keep incrementing the next element in the arr
            sum += nums[i]; 
            while(sum >= target) 
            {
                // if summed val is greater than target val:
                // trace from the current element & back 
                res = Math.min(res, i + 1 - left);
                sum -= nums[left];
                left++;
            }
        }
        return (res == Integer.MAX_VALUE) ? 0 : res;
    }
}