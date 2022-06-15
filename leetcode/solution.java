class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[nums.length];
        int[] returnArr = new int[2];
        int sum = 0;
        //copy content into temp array
        for(int i = 0; i < nums.length; i++){
            temp[i] = nums[i];
        }
        
        for(int j = 0; j < nums.length; j++){
            //store first Value & first index
            int firstValue = temp[j];
            returnArr[0] = j;
            for(int k = 1; k < nums.length; k++){
                sum = firstValue + temp[k];
                returnArr[1] = k;
                if (sum == target) {
                    break;
                }
            } 
        } 
        return returnArr;
    }
    public static void main(String[] args) {
        int[] nums = new int[6];
        int[] result = new int[2];
        int target = 3;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        
        result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + ",");
        }

    }
}