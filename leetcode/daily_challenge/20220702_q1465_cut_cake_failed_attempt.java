class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int n = horizontalCuts.length;
        int m = verticalCuts.length;
        
        int[] hori = new int[n + 2];
        int[] vert = new int[m + 2];
        hori[n-1] = 0;
        hori[n] = h;
        vert[m-1] = 0;
        vert[m] = w;
        for(int i = 0; i < n; i++){hori[i] = horizontalCuts[i];}
        for(int i = 0; i < m; i++){vert[i] = verticalCuts[i];}
        
        Arrays.sort(hori);
        Arrays.sort(vert);
        
        
        int hori_max = 0;
        int vert_max = 0;
        
        for(int i = 0; i < n+1; i++){
            hori_max = Math.max(hori_max, hori[i+1] - hori[i]);
        }
        
        for(int i = 0; i < m+1; i++){
            vert_max = Math.max(vert_max, vert[i+1] - vert[i]);
        }
        
        return hori_max * vert_max;
        
    }
}