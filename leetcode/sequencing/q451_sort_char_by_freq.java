class Solution {
    public String frequencySort(String s) {
        // NOTE: must clarify value type as "Integer" so that 
        // count.getOrDeFault() can use operand "+"
        Map<Character, Integer> count = new HashMap<>(); 
        String res = "";
        
        // write frequency count of each char into the dictionary
        for(char i : s.toCharArray()){    
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        
        // Store all char "keys" into the priority queue, ranked in descending order of
        // their "value" frequencies
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> count.get(b) - count.get(a));
        pq.addAll(count.keySet());
    
        while(pq.size() > 0){
            // pop character from priority queue one by one
            Character ch = pq.poll(); 
            int n = count.get(ch); // save running time & used memories MASSIVELY
            
            // fill into result by their frequencies
            for(int i = 0; i < n; i++){
                res += ch;
            }
        }
        
        return res;
    }
}