class Solution {
    public boolean isPossible(int[] nums) {
        int[] count = new int[2003]; // frequency counter calculate num of occurence of each num
        int[] end = new int[2003]; // num. of valid sequence end with i 
        
        // write each num's frequency into count arr
        for (int n : nums){
            count[n + 1000]++;
        }
        for (int i = 0; i <= 2002; i++){
            if (count[i] < 0){ // can't be less than 0, return false
                return false;
            } else if (i <= 2000){
                int cont = Math.min(count[i], i==0?0:end[i-1]); // extend the subsequences
                count[i] -= cont;
                end[i] += cont;
                count[i+1] -= count[i]; // start some new subsequences and we must take those
                count[i+2] -= count[i]; // take those 
                end[i+2] += count[i];   // update end to include the new subsequences.
            }
        }
        return true;
    }
}