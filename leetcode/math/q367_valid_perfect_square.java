class Solution {
    // note about a property of perfect square num:
    // 1+3+...+(2n-1) = (2n-1 + 1)n/2 = n * n = n^2
    public boolean isPerfectSquare(int num) {
        // perfect square num have a property: difference between them are: 3,5,7,9,11,...
        // we can use thsi property to caculate if certain number is a perfect square num
        int subNum = 1;
        while (num > 0) {
            num -= subNum;
            subNum += 2;
        }
        return num == 0;
    }
}