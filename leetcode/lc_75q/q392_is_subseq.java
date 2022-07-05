class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int j = 0;
        
        if(s.length() == 0){return true;}
        
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(j)){count++; j++;}
            if(count == s.length()) return true;
        }
        
        
        return false;
    }
}