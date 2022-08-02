class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, m = matrix[0].length, count = 0;
        int[] res = new int[n * m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                res[count] = matrix[i][j];
                count++;
            }
        }
        Arrays.sort(res);
        return res[k - 1];
    }
}