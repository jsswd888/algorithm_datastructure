// clarification of the question:
// "take card from begin/end of the row" means:
// if card at index 0 is been taken, the second time, you can take the 
// card at index 1 (the new "beginning" of the row); if card at index 0
// is never taken, then index 0 card is always the "beginning" of the card

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0; // sum of all num in array
        int curr_sum = 0; // sum of the curr sub array
        int min_sum = 0; // sum of the minimum sub array
        for(int i = 0; i < n; i++){
            sum += cardPoints[i];
            curr_sum += cardPoints[i];
            
            if(i < n - k) {min_sum += cardPoints[i];}
            else{min_sum = Math.min(min_sum, curr_sum -= cardPoints[i - (n - k)]);}
        }
        
        return sum - min_sum;
    }
}