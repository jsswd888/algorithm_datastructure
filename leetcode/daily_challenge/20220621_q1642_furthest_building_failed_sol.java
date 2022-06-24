// NOTE: This is Leetcode Challenge (6.21) question. It should be categorized as a Greedy question.
// This is the failed attempt; It DOES NOT PASS the tester. The result is not optimal; correct question in
// another file.
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int num_building = heights.length - 1;
        int count = 0;
        for(int i = 0; i < num_building; i++){
            if(heights[i] > heights[i+1] || heights[i] == heights[i+1]){
                count++;
                continue;
            } else if(heights[i+1] - heights[i] > 1){ 
               if(bricks > (heights[i+1] - heights[i])){
                   bricks -= (heights[i+1] - heights[i]);
                   count++;
               } else{
                   if(ladders <= 0){break;}
                   else{
                       ladders--;
                       count++;
                   }
               }
            } else if(heights[i+1] - heights[i] == 1){
                if(bricks <= 0){
                    if(ladders <=0){break;}
                    count++;
                    ladders--;
                }else{
                    count++;
                    bricks--;
                }
            }   
        }
        
        return count;
    }
}
