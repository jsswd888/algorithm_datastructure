class Solution {
    public int firstUniqChar(String s) {
        int res = -1;
        char[] s_arr = s.toCharArray();
        
        int[] freq = new int[26];
        
        for(int i = 0; i < s_arr.length; i++){
            freq[s_arr[i] - 'a']++;
        }
        
        for(int i = 0; i < s_arr.length; i++){
            if(freq[s_arr[i] - 'a'] == 1){
                res = i;
                break;
            } 
        }
        
        return res; 
    }
}

