class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (isMatched(word, pattern)) res.add(word);
        }
        return res;
    }
    
    
    /**
      * The principle of this method is: if it is a repititive pattern,
      * it will always return the first appearance index (e.g. "abb": b's index always 1)
      * The matched words have the same property, but the non-matched does not.
      */
    boolean isMatched(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) return false;
        }
        return true;
    }
}