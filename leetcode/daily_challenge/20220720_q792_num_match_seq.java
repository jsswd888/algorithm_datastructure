class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        
        // write occurance of each str in words array into a hashmap
        // format as: key: value = str(in words) : occur times 
        Map<String,Integer> map = new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        
        int res = 0; // return the num. of matched subsequences
        char ch[] = s.toCharArray(); // convert target string s to a char array
        
        for(String str:map.keySet()){
            
            // convert str from words to a char array one by one
            char temp[] = str.toCharArray(); 
            int i = 0; // counter of s
            int j = 0; // counter of words[i]
            
            while(i < ch.length && j < temp.length){
                if(ch[i] == temp[j]){ // find if any matched str
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
            
            if(j == temp.length){ // if all char matched, increment
                res += map.get(str);
            }
            
        }
        
      return res;  
    }
}
