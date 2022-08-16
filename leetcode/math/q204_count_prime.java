class Solution {
    // Sieve of Eratosthenes
    // 埃拉托斯特尼筛法：从2开始，把质数留下，把它所有的倍数全部筛去，如此提高效率
    public int countPrimes(int n) {
        boolean[] check = new boolean[n]; // array recording whether the number is checked
        int count = 0;
        for(int i = 2; i < n; i++){ // traverse all numbers from 2 to n
            // because we are start from 2 & mark all 2's times num as false,
            // when we go through all even num, we will find out that they are
            // marked "true", aka not prime
            if(check[i] == false){ 
                count++;
                
                // section of code where all multiple of current prime is marked as "checked"
                for(int j = i; j < n; j += i){
                    check[j] = true;
                }
            }
        }
        return count;
    }
}