class Solution {
    public int maxSubArray(int[] nums) {
        int buffer = 0; // cumulative sum of all nums in arr "nums"
        int res = Integer.MIN_VALUE; // track largest sum of subarr
        
        for(int i : nums){
            buffer += i;
            
            if(res < buffer){ res = buffer; }
            if(buffer < 0){buffer = 0;} // reset buffer if current sub-arr has a negative sum
        }
        
        return res;
        
    }
}