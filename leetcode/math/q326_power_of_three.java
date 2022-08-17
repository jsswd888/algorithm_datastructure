class Solution {
    public boolean isPowerOfThree(int n) {
        // special case
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        }
        
        // power of three must be divisible by 3 all the time, until reach 3
        while (n != 3) {
            if (n % 3 != 0) {
                return false;
            }
            
            n /= 3;
        }
        
        return true;
    }
}