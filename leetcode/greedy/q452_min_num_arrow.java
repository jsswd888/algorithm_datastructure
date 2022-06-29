class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        
        int res = 0;
        long prev_up = Long.MIN_VALUE;
        for (int [] i: points) {
            if (i[0] > prev_up) {
                prev_up = i[1];
                res++;
            }
        }
        return res;
    }
}