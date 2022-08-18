class Solution {
    public int minSetSize(int[] arr) {
        // use hashmap to calculate the frequency of each element;
        HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
        
        // then, calculate the half of frequency, get them out & return
        // use a frequency array to record occurence of each num.
        // freq[i] -> how many times that freq is encountered.
		int [] freq = new int[100001];
		for(int key: map.keySet()){
			freq[map.get(key)]++; 
		}
		int size = arr.length, count = 0;
        
        // traverse array in rev order to greedily choose the max frequency
		for(int i = freq.length - 1; i >= 0 && size > arr.length/2;){ 
			if(freq[i]==0){
				i--;
			}
            // otherwise keep reduce the size till freq[i]==0 -> use up all high freq elements
            else{ 
				while(freq[i] != 0 && size > arr.length/2){
					size -= i;
					freq[i]--; 
					count++;
				}
				if(size <= arr.length/2) return count;
				i--;
			}
		}
		return count;
    }
}