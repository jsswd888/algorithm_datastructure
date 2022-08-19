class NumArray {
    private int[] sum_Arr;
    
    public NumArray(int[] nums) {
        // remember to set length as num.length+1 to avoid overflow problem
        sum_Arr = new int[nums.length+1]; 
        for(int i = 1; i < sum_Arr.length; i++){
            sum_Arr[i] = nums[i - 1] + sum_Arr[i - 1]; 
        }
    }
    
    public int sumRange(int left, int right) {
        return sum_Arr[right+1] - sum_Arr[left]; 
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */