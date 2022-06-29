class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int j = 0;
        
        if(s.length() == 0){return true;}
        
        // NOTE HERE THE USE OF COUNTERS & Place of var "count"
        // we find the char in s one by one, and only go to next char if find one matched char
        // in str "t" (so that we won't have same index return for given case: s = "aaa", t = "baa")

        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(j)){count++; j++;}
            if(count == s.length()) return true; // must return inside the for loop to avoid nullpointerexception
        }
        
        
        return false;
    }
}