class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length == 1) return 1;
        int prev = nums[1] - nums[0]; 
        int len = prev != 0 ? 2 : 1;
        for(int i = 2; i < nums.length; i++){
            int curr = nums[i] - nums[i-1];
            // NOTE: why can we use >= / <= here:
            // deletion allowed; so if previous one is equal, we can skip it. 
            // The given increment case only take place when the adjacent difference is one positive + one negative
            if((prev >= 0 && curr < 0) || (prev <= 0 && curr > 0)){
                prev = curr;
                len++;
            } 
        }
        
        return len;
    }
}