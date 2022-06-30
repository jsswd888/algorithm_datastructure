class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // frequency map that store values as: key:val = nums:appearance frequency
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            //getOrDefault: get defaulted value of certain key
            // if certain key presented: increment 1; if not, initialize the key & increment 1
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }
        
        // initialize the priority queue with comparator
        PriorityQueue<Node> pq = new PriorityQueue<Node>(new NodeComparator());
        
        for(Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            pq.add(node); 
        }
        
		// pq has the nodes ordered as per the frequency by now.
		// Poll the top k nodes and extract the nums
        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = pq.poll().getNum();
        }
        
        return res;
    }
}


// create node obj for storing num. in mums & their appearance frequency
class Node {
        int num;
        int frequency;
        
        public Node(int num, int frequency) {
            this.num = num;
            this.frequency = frequency;
        }
        
        public int getFrequency() {
            return frequency;
        }
        
        public int getNum() {
            return this.num;
        }
}

// comparator class; used for comparing frequencies of different nodes   
class NodeComparator implements Comparator<Node> {
    public int compare(Node cur, Node next) {
        return next.frequency - cur.frequency;
    }
}