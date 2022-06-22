// goal: given targeted str s: after deleting some char
// s is identical to a word in the dictionary: must be longest word & least lexigraphic in the dict
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        int s_len = s.length();
        int max_len = 0; // record the longest word's len in dict
        String answer = "";
        int count = 0; // counter, track if we have gone through all elemen in dictionary
        Collections.sort(dictionary); // sort the dictionary lexigraphically
        
        while(count < dictionary.size()){   
            int i = 0; // ptr traverse the input str s
            int j = 0; // ptr traverse curr word in dict
            
            String curr = dictionary.get(count); // get curr word in dict
            int curr_len = curr.length();
            
            while (i < s_len && j < curr_len) {
                // increment j if find matched alphabet on curr word in dict
                if (s.charAt(i) == curr.charAt(j)){j++;} 
                i++; // increment s ptr each iteration
            }
            
            // compare & choose final answer
            // if current word is a substring (all char matched) AND
            // current word len > previous stored max len OR 
            // current word len = previous stored max len AND current word smaller than previous stored answer lexigraphically
            if (j == curr_len && (j > max_len || (j == max_len && curr.compareTo(answer) < 0))) {
                // update new result
                max_len = j;
                answer = curr;
            }
            count++;
        }
        return answer;
    }
}