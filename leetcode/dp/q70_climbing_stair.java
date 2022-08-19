class Solution {
    public int climbStairs(int n) {
        // 1: 1; total 1
        // 2: 1+1 / 2; total 2
        // 3: 1+1+1/2+1/1+2; total 3
        // 4: 1+1+1+1/2+2/2+1+1/1+1+2/1+2+1 // 5;
        // This is a fibanacii series
        if (n <= 2){
            return n;
        }
        
        int prev_1 = 1;
        int prev_2 = 2;
        int temp = 0;
        
        for(int i = 2; i < n; i++){
            temp = prev_2;
            prev_2 += prev_1;
            prev_1 = temp;
        }
        return prev_2;
    }
}