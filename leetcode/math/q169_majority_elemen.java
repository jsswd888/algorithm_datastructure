class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0; //math.floor(nums.length / 2);
        int res = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(res == nums[i]){
                count++;
                if (count > Math.floor(nums.length / 2)) break;
            } else{
                res = nums[i];
                count = 1;
            }
        }
        return res;
    }
}