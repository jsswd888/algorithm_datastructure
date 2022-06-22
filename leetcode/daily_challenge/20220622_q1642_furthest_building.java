// This is the correct version of q1642 greedy problems
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        //use priority queue to keep track of the gap between buildings
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < heights.length - 1; i++){
            int d = heights[i + 1] - heights[i]; // height difference between adjacent buildings
            // add the difference into the priority queue if next building is higher than current one
            if (d > 0){pq.add(d);} 
            if (pq.size() > ladders){bricks -= pq.poll();} // use bricks for least gaps (pop one out each time)
            if (bricks < 0){return i;} // if there is no bricks after use all ladders
        }
        
        // if passed all buildings & ladder, brick enough
        return heights.length - 1;
    }
}
