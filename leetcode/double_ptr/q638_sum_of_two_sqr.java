class Solution {
    public boolean judgeSquareSum(int c) {
        //base case
        if(c < 0 || c > Integer.MAX_VALUE){return false;}
        
        for(int i = 0; i <= Math.sqrt(c); i++){
            if(Math.floor(Math.sqrt(c - i * i)) == Math.sqrt(c - i * i)){return true;}
        }
        
        return false;
    }
}