class Solution {
    public boolean validPalindrome(String s) {
        int i = 0; // beginning of the str
        int j = s.length() - 1; // end of the str
        
        while(i < j){ // traverse from both sides: see if is palindrome
            if(s.charAt(i) == s.charAt(j)){
                // when satisfy palindrome: go to next case
                i++;
                j--;
            } else {
                // when not palindrome: check the next char (i+1 case OR j-1 case) 
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }
    
    public boolean isPalindrome (String s, int i, int j){
        while(i < j){
            // check if next char satisfy palindrome: if can, goto next until reaching the end
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else {
                // because at most delete one char & we already done that at "validpalindrome" phase, if next pair of char still not palindrome, we have to return false
                return false;
			}
        }
        return true;
    }
}