class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        // terminate the loop when found enough spaces to plant flowers
        for (int i = 0; i < len && count < n; i++) { 
            if (flowerbed[i] == 1) {
                continue;
            }
            
            // avoid boundary exception case
            // if at begin or end, manually "add" a '0' for both case
            int prev = i == 0 ? 0 : flowerbed[i - 1];
            int next = i == len - 1 ? 0 : flowerbed[i + 1];
            if (prev == 0 && next == 0) {
                count++;
                flowerbed[i] = 1; //"plant" here
            }
        }
        return count >= n;
    }

}