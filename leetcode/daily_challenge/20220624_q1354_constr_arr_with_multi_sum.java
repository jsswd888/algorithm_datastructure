// q1354; priority queue
class Solution {
    public boolean isPossible(int[] target) {
        if (target.length == 1){ return target[0] == 1;} // base case

        var pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int sum = 0; // sum of all num in target arr
        for (int i = 0; i < target.length; i++) {
            pq.add(target[i]);
            sum += target[i];
        }

        while (pq.peek() != 1) {
            int curr = pq.poll();
            if (sum - curr == 1) {return true;}

            int x = curr % (sum - curr);
            sum = sum - curr + x;

            if (x == 0 || x == curr) {return false;}
            else{pq.add(x);}
        }

        return true;
    }
}