class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        
        int res = 0;
        int prev_up = intervals[0][0];
        
        for(int[] i : intervals){
            if(i[0] < prev_up){
                res++;
            } else{
                prev_up = i[1];
            }
        }
        
        return res;
    }
}