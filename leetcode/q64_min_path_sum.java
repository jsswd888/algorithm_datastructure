class Solution {
    //dynamic programming
    // question def: given a x*x grid, go through from top left to bottom right
    // requirement: each time can only go right or down; find the path with smallest sum
    public int minPathSum(int[][] grid) {
        // traverse through the grid (from top to bottom, left to right)
        for(int i = 0; i< grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                // we store the sum of previous nodes at the current grid
                if(i == 0 && j == 0){
                    // top-left edge case: no previous node so no incrementation
                    grid[i][j] = grid[i][j];
                } else if (i == 0){
                    // first row case: can only go right; so we only consider the node at left 
                    grid[i][j] = grid[i][j] + grid[i][j-1];
                } else if (j == 0){
                    // first column case: can only go down; so we only consider the node at top
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                } else{
                    // general case: can go both right and down; so we need to consider both (find the min of down & right)
                    grid[i][j] += Math.min(grid[i][j-1], grid[i-1][j]);
                }
            }
        }
        
        // return the sum of the most bottom right node
        return grid[grid.length-1][grid[0].length-1];
    }
}