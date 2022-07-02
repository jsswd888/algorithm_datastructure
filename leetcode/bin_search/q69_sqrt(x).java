class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
        // We can't use the code below, as it will cause compile error:
        // "possible loss accuracy when convert double to int"
        // BUT, since we only desire the int section of the sqrt result, we can still
        // use forced conversion here.
        // return Math.floor(Math.sqrt(x)); 
    }
}

// Use binary search method:
class Solution {
    public int mySqrt(int x) {
        // use binary search method here
        // NOTE: sqrt of a num "x" must lie between 0 ~ x
        // also, satisfy sqrt = x / sqrt
        int l = 1, h = x;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int sqrt = x / mid;
            if (sqrt == mid) {
                return mid;
            } else if (mid > sqrt) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        
        return h;
    }
}