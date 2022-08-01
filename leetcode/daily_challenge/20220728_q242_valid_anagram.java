class Solution {
    public boolean isAnagram(String s, String t) {
        // must have same length
        if(s.length() != t.length()) return false;
        
        // convert str to char array
        char cs[] = s.toCharArray();
        char ct[] = t.toCharArray();
        
        // sort by lexigraphical order
        Arrays.sort(cs);
        Arrays.sort(ct);
        
        // compare one char by one char
        for(int i = 0; i < s.length(); i++){
            if(cs[i] != ct[i]) return false;
        }
        return true;
    }
}