class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> answers = new ArrayList<List<String>>();

        Arrays.sort(products); // sort the product list in lexigraphical order 

        for (int i = 0; i < searchWord.length(); i++){
            // counter reset each iteration
            int j = 0; // traverse product list counter
            int added_count = 0; // added word counter
            String searchString = searchWord.substring(0,i+1); // slice of the substring we need to search for 
            List<String> current = new ArrayList<String>(); // 1d list, store search result each time

            while (j < products.length && added_count < 3){ // traverse the product list, find first three matched words (min lexigraphically)
                if (products[j].startsWith(searchString)){
                    current.add(products[j]);
                    added_count++;
                }
                j++;
            }
            answers.add(current); // add the search result list into the return 2-d list
        }
        return answers;
    }
}