class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        //NOTE: set has properties: no duplicate elements
        Set<Integer> set = new HashSet<>();
        for(int i : nums){set.add(i);}
        for(int i : nums){
            int max = 1, prev = i-1, next = i+1;
            
            // use the two while loop below to traverse both sides
            while(set.contains(prev)){
                max++;
                set.remove(prev);
                prev--;
            }
            
            while(set.contains(next)){
                max++;
                set.remove(next);
                next++;
            }
            
            res = Math.max(res, max);
        }
        
        return res;
    }
}