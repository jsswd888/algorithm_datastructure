class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		// pre stores the number data in last row, curr writes in the data in this line 
        List<Integer> curr, pre = null;
		for (int i = 0; i < numRows; i++) {
			curr = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++){
				if (j == 0 || j == i){
					curr.add(1); // edge case; 1 at beginning & end in each row
                } else {
                    // inner case: mimic the animation as shown
					curr.add(pre.get(j - 1) + pre.get(j)); 
                }
            }
			pre = curr; 
			res.add(curr);
		}
		return res;
    }
}