class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < n; i++){
            int prev = i == 0 ? nums[i] - 1 : nums[i-1]; // make sure to avoid case like [2,3,3,...]
            int next = i == n - 1 ? nums[i] - 1 : nums[i + 1]; // make sure to avoid case like [...,3,3,4]
            
            if(nums[i] != prev && nums[i] != next){ // if not single element, even at front or end position, still pass this test
                res  = nums[i];
            }
        }
        
        return res;
    }
}