class Solution {
    public String longestCommonPrefix(String[] strs) {
        // traverse the first word & slice out the substring prefix
        for (int i = 0; i < strs[0].length(); i++) {
            char substr = strs[0].charAt(i);
            // the inner for loop will check all remaing words' first index char one by
            // one; if all matched, the outer for loop will run and go to char at next index
            for (int j = 1; j < strs.length; j++) {
                // traverse the rest words in the "strs" arr
                // if at curr index is a null str or curr str has different prefix
                // then first word, return current result
                if (strs[j].length() == i || strs[j].charAt(i) != substr) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // if run without problems, this shows all words share same prefix (all same words)
        // we just return the first words in the arr
        return strs[0];
    }
}

// explanation: https://leetcode.com/problems/longest-common-prefix/discuss/2213953/CJavaPython3JavaScript-Solution-(-Easy-Code)