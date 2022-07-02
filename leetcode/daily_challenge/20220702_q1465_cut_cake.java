/* Explanation of why use long: "actually in some cases (a*b) creates such a big answer 
 that it surpasses the storing capacity of an int variable ( called memory overflow) , 
 hence we use long to store all results and then after we have done modulo 
 we convert out final answer to int."
 */
class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int n = horizontalCuts.length;
        int m = verticalCuts.length;
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        
        long hori_max = h - horizontalCuts[n-1];
        long vert_max = w - verticalCuts[m-1];
        int prev = 0;
        
        for(int i = 0; i < n; i++){
            hori_max = Math.max(hori_max, horizontalCuts[i] - prev);
            prev = horizontalCuts[i];
        }
        
        prev = 0;
        
        for(int i = 0; i < m; i++){
            vert_max = Math.max(vert_max, verticalCuts[i] - prev);
            prev = verticalCuts[i];
        }
        long mod = (long)1e9+7;
        
        return (int)((hori_max * vert_max) % mod);
        
    }
}