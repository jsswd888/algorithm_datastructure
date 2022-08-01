class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int left = -1;
        int right = -1;
        // find left
        while(l <= h) {
            int mid = l + (h - l) / 2;
            if(nums[mid] > target) {
                h = mid - 1;
            } else if(nums[mid] < target) {
                l = mid + 1;
            } else {
                left = mid;
                h = mid - 1;
            }
        }
        l = 0;
        h = nums.length - 1;
        // find right
        while(l <= h) {
            int mid = l + (h - l) / 2;
            if(nums[mid] > target) {
                h = mid - 1;
            } else if(nums[mid] < target) {
                l = mid + 1;
            } else {
                right = mid;
                l = mid + 1;
            }
        }
        return new int[]{left, right};
    }
}