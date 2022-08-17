class Solution {
    private final String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; // store morse codes for all 26 alphabet
    
    public int uniqueMorseRepresentations(String[] words) {
        final Set<String> codes = new HashSet<>(); // set property: no duplicate elements

        for (String word : words) {
            // use either stringbuilder or string is acceptable here
            //final StringBuilder morseCode = new StringBuilder();
            String curr = "";
            for (int i = 0, n = word.length(); i < n; i++) {
                //morseCode.append(morseCodes[word.charAt(i) - 'a']);
                curr += morseCodes[word.charAt(i) - 'a'];
            }
            // add formed morse codes to the codes set; if duplicate, it won't be added
            //codes.add(morseCode.toString()); 
            codes.add(curr);
        }

        return codes.size();    
        
    }
        
}