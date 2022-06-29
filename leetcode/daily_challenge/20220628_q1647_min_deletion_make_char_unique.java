class Solution {
    // mechanism:  count each character first. For each 26 characters, 
    // check if it's count is already used. If so, delete characters 
    // until you find unused count, or reach zero
    public int minDeletions(String s) {
        int count[] = new int[26]; // store the appearance frequency of each alphabet
        int res = 0; // record the num of char to delete
        // use set to make sure no same. amount of appearance of diff alphabet
        Set<Integer> used = new HashSet<>(); 
        
        // traverse the str, record down appearance of each alphabet (ascii val)
        for (int i = 0; i < s.length(); i++){ count[s.charAt(i) - 'a']++;}
           
        // traverse the counter arr
        for (int i = 0; i < count.length; ++i) {
            // check appeared alphabet WHILE appearance num. is unique
            while (count[i] > 0 && !used.add(count[i])) {
                // if alphabet DO occured but occurence time NOT unique
                count[i]--; // decrement until it is unique
                res++; // increment the delete counter
            }
        }        
        return res;
    }
}