class Solution {
    public String reverseVowels(String s) {
        char[] ret = new char[s.length()];
        String vowel = "aeiouAEIOU";
        int i = 0;
        int j = s.length()-1;
        
        while(i <= j){
            char at_i = s.charAt(i);
            char at_j = s.charAt(j);
            
            if(!vowel.contains(String.valueOf(at_i))){
                ret[i++] = at_i; // NOTE: ret[i++] = at_i is same as ret[i] = at_i; i++; so as the ret[j--]
            } else if(!vowel.contains(String.valueOf(at_j))){
                ret[j--] = at_j;
            } else{
                ret[i++] = at_j;
                ret[j--] = at_i; 
            }
        }

        return new String(ret);
    }
}