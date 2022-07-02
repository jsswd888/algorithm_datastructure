class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        for(int i = 0; i < letters.length; i++){
            if(letters[i] > target){
                return letters[i];
            }else{
                continue;
            }
        }
        
        return letters[0];
    }
}

// below is the binary search version
// Similar to double ptrs, CAREFULLY decide which one is the start & which one is the end
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;
        
        // NOTE that our arr is sorted in "increasing" order
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (letters[mid] > target){ // case when current mid char > target
                end = mid - 1; // trace the left half
            } else{
                start = mid + 1; // current mid char 
            }
        }
        
        return letters[start % letters.length];
    }
}