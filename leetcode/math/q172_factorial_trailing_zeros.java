class Solution {
    // recursion design
    public int trailingZeroes(int n) {
        // 0 at the bottom of this num come from product of 2 * 5;
        // we have more 2 than 5, so just need to count how many 5 we will have
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}