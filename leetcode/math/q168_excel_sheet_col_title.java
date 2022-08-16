class Solution {
    public String convertToTitle(int columnNumber) {
        int n = columnNumber;
        if (n == 0) {
            return "";
        }
        
        n--;
        return convertToTitle(n / 26) + (char) (n % 26 + 'A');
    }
}