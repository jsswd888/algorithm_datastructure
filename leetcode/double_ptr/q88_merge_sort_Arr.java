import java.util.Arrays;

// See following two link for "merging two arrays into one java" & "java sort arr in descending order"
// https://www.geeksforgeeks.org/java-program-to-merge-two-arrays/
// https://stackoverflow.com/questions/1694751/java-array-sort-descending

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //merge in ascending order; 
        int[] merged = new int[m + n];
        
        // NOTE: using arraycopy() to merge two arrays format
        // System.arraycopy(arr1,0,resultarr,start_index(0), arr1.length(end_index));
        // System.arraycopy(arr2,0,resultarr,start_index(arr1.length), arr2.length(end_index));
        System.arraycopy(nums1,0,merged,0,m);
        System.arraycopy(nums2, 0, merged, m, n);

        // sort arrays in ascending order; descending order use Arrays.sort(array, Collections.reverseOrder());
        Arrays.sort(merged);
        
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = merged[i];
        }
        
    }
}