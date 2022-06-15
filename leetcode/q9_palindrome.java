class Solution {
    public boolean isPalindrome(int x) {        String palindromeNum = Integer.toString(x);
        //System.out.println("Input num is: " + palindromeNum);
        // 2 case: #1: if negative or positive
        if (palindromeNum.charAt(0) =='-'){
            // this shows the Num is negative
            for (int i = 1; i < palindromeNum.length(); i++){
                if (palindromeNum.charAt(i) != palindromeNum.charAt(palindromeNum.length() - 1 - i)){
                    return false;
                }
            }
            return true;
        }else{
            for (int i = 0; i < palindromeNum.length(); i++) {
                if (palindromeNum.charAt(i) != palindromeNum.charAt(palindromeNum.length() - 1- i)) {
                    return false;
                }
            }
            return true;
        }
    }
}