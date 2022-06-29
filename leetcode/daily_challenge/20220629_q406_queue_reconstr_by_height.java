class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // rank the 2-d array with two rules:
        // 1. descending order in terms of height (each people[0])
        // 2. ascending order in terms of num. people heigher at front (each people[1])
        // mechanism of a[1] - b[1] & b[0] - a[0]: see compareTo() method:
        // for a-b comparison: >0: b; <=0: a; utilize in sort: which one been choosed 
        // is put at the front
        Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        List<int[]> res = new LinkedList<>();
        // traverse the 2-d array, insert people based on their k index
        // because it is inserted to a linked list, we will keep tract of the previously
        // inserted nodes; that being said: even if we inserted 2 people to index 1, 
        // the one inserted earlier will directly go to index 2 (similar like "squeeze others")
        // and inserted to its desired index.
        // NOTE: Linkedlist share this SAME characteristics with arraylist.
        for (int[] p: people){res.add(p[1], p);}

        // when returning, we convert back from linkedlist to 2-d array
        return res.toArray(new int[people.length][2]);
    }
}