class Solution {
    //double ptr
    public boolean validPalindrome(String s) {
        // question def: an str can be palindrome when deleting AT MOST one char from the str
        int i = 0; // beginning of the str
        int j = s.length() - 1; // end of the str
        
        while(i < j){ // traverse from both sides: see if is palindrome
            if(s.charAt(i) == s.charAt(j)){
                // when satisfy palindrome: go to next case
                i++;
                j--;
            } else {
                // when not palindrome: check the next char (i+1 case & j-1 case) 
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }
    
    public boolean isPalindrome (String s, int i, int j){
        while(i < j){
            // check if next char satisfy palindrome: if can, return validPalindrome & goto next
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else {
                return false;
			}
        }
        return true;
    }
}