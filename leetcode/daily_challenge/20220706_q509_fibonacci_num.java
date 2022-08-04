class Solution {
    public int fib(int n) {
        if(n <= 1) return n; // base case #1 & #2：0，1，
        return fib(n - 1) + fib(n - 2); // principle of fibonacci: 0,1,2,3,
    }
}