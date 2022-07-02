class Solution {
    public int pivotIndex(int[] nums) {
        int res = -1;
        int sum = 0;
        int curr = 0;
        for(int i : nums){sum += i;}
        for(int i = 0; i< nums.length; i++){
            curr += i == 0 ? 0 : nums[i-1];
            if (curr * 2 == sum - nums[i]){
                res = i;
                break;
            }
        }
        
        return res;
    }
}