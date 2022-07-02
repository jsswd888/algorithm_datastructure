// Dutch Flag algorithm;
// Note that the given algorithm has high limitations (only applicable in small-scale application.)
class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3]; // store appearance frequency of each "color"
        // fill in (only 0,1,2 in nums[], so we can directlt do this)
        for (int i : nums) {
            count[i]++;
        }
        
        // double var needed (reverse position of i / index should be fine)
        int index = 0;
        for(int i = 0; i < 3; i++){
            while (count[i] > 0) {
                //fill in to original array according to their appearance frequency
                nums[index] = i;
                index++;
                count[i]--;
            }
        }
    }
}