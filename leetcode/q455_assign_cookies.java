import java.util.Arrays;

class Solution {
    // greedy
    public int findContentChildren(int[] g, int[] s) {
        // sort the two array in ascending order
        Arrays.sort(s);
        Arrays.sort(g);
        
        int maxNum = 0; // return the max possibility of assigning cookies to children
        
        for(int i = 0; i < s.length; i++){//traverse the size array
            if (g.length == maxNum) { //check if there is kid; if not, break & return maxNum as 0
                break;
            }
            
            if(s[i] >= g[maxNum]){ //check: if the size of cookie is acceptable for kid at same position
                maxNum++; // if accepted: increment maxNum
            }
        }
        
        return maxNum;
    }
}