> # algorithm_datastructure

This repository keeps track of my Leetcode question progress & couple implementation of learned data structures & algorithms 

> ## Updates
- 6.20 update: double pointer one question left; rest section wait for update
- 6.22: finished doubel pointer section; start with greedy; daily question updated routinely.
- 6.29: New **Data Structure** section plan: also include some leetcode questions. The folder structure & introductions will be modified in near future (after finishing dynamic programming & k-th element sequencing section; planned to start in early July)
- 7.5 Take a note of the `ListNode` question; encountered CAN'T DO cases couple of times! NOTE: usually use `ListNode` for singly-linked list questions
- 7.6 No question done; need review tomorrow
- 7.7 No question done; need review (preparing exams)
- 8.1 update: no major update during July: will first fill in daily question one by one; daily question: 7.26 ~ 23 , 7.30,31 **need review**
- 8.2 update: 7.17,18,22 **need review**: the rest 4 questions in that week finished
- 8.8 update: finally finished semester work & currently no update for 8.7, 8.8 daily question; will follow up since tomorrow
- 8.16 update: 8.7 - 8.15 daily question pending review; finish math section q67, 168, 172, 204, 405, 504 today & have related code submitted
- 8.17: finish daily challenge, q462(6.30 daily question & reviewed), q169, q367, q326, q238, q628 Math problems; math section finished; math section finish & wait to start data structures.

> ## Leetcode

I am currently following the following link for leetcode sections:

[LeetCode Question Guide & Some Solution](https://github.com/CyC2018/CS-Notes/blob/master/notes/Leetcode%20%E9%A2%98%E8%A7%A3%20-%20%E7%9B%AE%E5%BD%95.md)

> ### Daily Challenge
| Date | Questions | Solutions | Notes
| --- | --- | --- | ---
|2022.6.17| **968. Binary Tree Cameras**|[Solution](./leetcode/daily_challenge/20220617_q968_bst_camera.java) <br> [Explanation](https://leetcode.com/problems/binary-tree-cameras/discuss/2160273/JAVA-oror-EXPLAINED-oror)| BST; DFS
| 2022.6.19 | **1268. Search Suggestion System**  | [Solution](./leetcode/daily_challenge/20220619_q1268_search_suggestion_sys.java)
| 2022.6.21 | **1262. Furthest Building to Reach** | [Solution](./leetcode/daily_challenge/20220621_q1642_furthest_building.java), <br>[Failed Solution](./leetcode/daily_challenge/20220621_q1642_furthest_building_failed_sol.java) <br> | **Greedy**
| 2022.6.22 | **215. Kth largest element in array** | [Solution](./leetcode/daily_challenge/20220622_q215_kth_largeElem_arr.java) | **Sequencing Problem**
| 2022.6.23 | **630. Course Schedule III**| [Solution](./leetcode/daily_challenge/20220623_q630_course_schedule_III.java) <br> [Explanation](https://leetcode.com/problems/course-schedule-iii/discuss/2185367/Java-or-Greedy-or-Explained) |  **Greedy**
| 2022.6.24 | **1354. Construct target array with multiple sums** | [Solution](./leetcode/daily_challenge/20220624_q1354_constr_arr_with_multi_sum.java) <br> [Explanation](https://leetcode.com/problems/construct-target-array-with-multiple-sums/discuss/2189445/Visual-Explanation-or-JAVA-Max-Heap) | **Max heap**; Priority queue application; done reversely
| 2022.6.25 | **665. Non-decreasing Array**|[Solution](./leetcode/daily_challenge/20220625_q665_non-decreasing_array.java) <br> [Explanation](https://leetcode.com/problems/non-decreasing-array/discuss/2193084/Visual-Explanation-or-JAVA-Greedy) | **Greedy**; <br>  similar to a palindrome question (q345 probably)
| 2022.6.26 | **1423. Max points you can obtain from cards**| [Solution](./leetcode/daily_challenge/20220626_q1423_max_pts_from_cards.java) <br> [Explanation](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/discuss/2197791/Reframing-The-Question-or-JAVA-Explained)| Notice how explanation "shift" the question: change to another way that simpler to code
| 2022.6.27 | **1689. Partitioning Into Minimum Number Of Deci-Binary Numbers**| [Solution](./leetcode/daily_challenge/20220627_q1689_Partitioning_min_deci_bin_num.java)<br> [Explanation](https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/discuss/2202690/One-Main-Observation-%2B-Interview-Tips-or-JAVA-Explained) | Look at the thinking of how to solve the problem -> can be found from observing the given data in the question! <br> notice about the usage of str.charAt(i) - 'num': can actually return int result!
| 2022.6.28 | **1647. Minimum Deletions to Make Character Frequencies Unique** | [Solution](./leetcode/daily_challenge/20220628_q1647_min_deletion_make_char_unique.java) | **Greedy**;<br> NOTE about use of Set (property of contain no duplicate elements)
| 2022.6.29 | **406. Queue Reconstruction by Height**| [Solution](./leetcode/daily_challenge/20220629_q406_queue_reconstr_by_height.java) <br> [Explanation](https://leetcode.com/problems/queue-reconstruction-by-height/discuss/2211641/Visual-Explanation-or-JAVA-Greedy) | **Greedy**; <br> take note of the explanation & comments in the code
| 2022.6.30 | **462. Minimum Moves to Equal Array Elements II** | [Solution](./leetcode/daily_challenge/20220630_q462_min_moves_to_equal_arr_elem_II.java)
| 2022.7.1 | **1710. Maximum Units on a Truck** | [Solution](./leetcode/daily_challenge/20220701_q1710_Maximum_Units_on_a_Truck.java) | Greedy; NOTE the usage of var "availability": helps avoid overload & underload problem; Moreover, using only while loop decrease time complexity
| 2022.7.2 | **1465. Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts** | [Solution](./leetcode/daily_challenge/20220702_q1465_cut_cake.java) <br> [failed attempt](./leetcode/daily_challenge/20220702_q1465_cut_cake_failed_attempt.java) | **NOTE** about its using of data type **long** and adoption of **mod** to convert back from long to int, where `mod = 1e9 + 7` <br> Adoption of long pretty useful to avoid memory overflow (inputted num. > max int datatype); similar cases occured before in another leetcode question; <br> Failed attempt also attached; thinking is correct but need improvement on implementation; <br> explanation of why use `Long` see in `./solution.java` comments. 
| 2022.7.3 | **376. Wiggle Sequence** | [Solution](./leetcode/daily_challenge/20220703_q376_wiggle_seq.java) | **NOTE** the use of `>=` judgement; <br> **CAREFULLY** read the question: we are allowed to delete elements from the array to make it as `wiggle sequence`. Therefore, the `if` condition set in the code help us to increment at correct conditions.
| 2022.7.4 | **135. Candy** | [Solution From Leetcode (Solution 2)](https://leetcode.com/problems/candy/solution/) | **NOTE: NOT FINISHED; REVIEW NEEDED**
| 2022.7.5 | **128. Longest Consecutive Sequence** | [Solution](./leetcode/daily_challenge/20220705_q128_longest_consctve_seq.java) <br> [Explanation](https://leetcode.com/problems/longest-consecutive-sequence/discuss/2238885/Java-O(n)-90-faster-Easy-Explanation-With-comments) | Take a look at the solution & re-calculate the time complexity for this solution (requirement is `O(n)`). 
| 2022.7.6 | **509. Fibonacci Number** | [Solution](./leetcode/daily_challenge/20220706_q509_fibonacci_num.java) | **Most standard fibonacci num implementation**; <br> might be some faster / less mem-consumption method, but this is the simplest & most straightforward one. 
| 2022.7.19 | **118. Pascal's Triangle** | [Solution](./leetcode/daily_challenge/20220719_q118_pascal_triangle.java) | see comment for further explanation
| 2022.7.20 | **792.Number of Matching Subsequences** | [Solution](./leetcode/daily_challenge/20220720_q792_num_match_seq.java) | **NOTE** how the **`Hashmap`** is used in the implementation of this algorithm and how to keep track on ***targeted str*** & ***comparing sub-str***
| 2022.7.21 | **92. Reverse Linked List II** | [Solution](./leetcode/daily_challenge/20220721_q92_reverse_linkedList_II.java) | **NOTE** the sequence of changing the `node.next` (so that **no inheritance loss**) and how the `prev`, `curr`, and`forw` pointer is set; <br> see similar practice `Q206.Reverse Linked List I` [here]((./leetcode/lc_75q/q206_reverse_linked_list.java)) 
| 2022.7.22 | **86. Partition List** | [Solution](./leetcode/daily_challenge/20220722_q86_partition_list.java) | **NOTE** the use of two ***singly-linked list*** `leftTail` & `rightTail`: keep track of two type nodes as required, based on value, and then combine them into one
| 2022.7.24 | **240. Search a 2D Matrix II** | [Solution](./leetcode/daily_challenge/20220724_q240_search_a_2d_mat.java) | classical **Dynamic Programming (Dp) problem;** <br> simple approach: search through each index in 2-d array one by one and find if any of them matches; if not, return `false` finally. 
| 2022.7.25 | **34. Find First and Last Position of Element in Sorted Array** | [Solution](./leetcode/daily_challenge/20220725_q34_find_first_last_elemen_in_sorted_arr.java) | a classical **Recursion** problem; <br> initially set the return numbers as -1 (default value); the basic idea is to run the recursion **2 times:** first time in the left half and second time in the right half; because it is sorted, the first time found index will be the start index and the second time found index will be the end index
| 2022.7.26 | **236. Lowest Common Ancestor of a Binary Tree** | [Solution](./leetcode/daily_challenge/20220726_q236_LCA_of_bin_tree.java); <br> [Video Explanation](https://www.youtube.com/watch?v=Sy1HmN6RbBA); <br> [Graphical Explanation](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/discuss/2334071/C%2B%2BJava-or-Full-Explanations-or-bits-99.87) | NOTE: what drawn as the return "null" is actually whether ***p* or *q* is found** in related subtree; if found, return it; if not, return null;<br> This is a **bin tree** problem
| 2022.7.27 | **114. Flatten Binary Tree to Linked List** | [Solution](./leetcode/daily_challenge/20220727_flatten_binTree_to_linkedlist.java); <br> [Explanation: 2.Intuition](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/discuss/2340103/Two-different-approaches-faster-than-100-with-detailed-explanation-()-or-Java) | The principle to solve this problem is: firstly find the right-most child in the left subtree (relative to root); then, connect the right subtree to this rightmost node in left subtree, move left subtree of the root completely to the right, and then set the "new root" to the right child of the root (for further recursion). After doing that, we are now at the first right child of the root (first level flattening finished). The thing left for us to do is to do this on each root.rightChild one by one (set each as the new root relatively)
| 2022.7.28 | **242. Valid Anagram** | [Solution](./leetcode/daily_challenge/20220728_q242_valid_anagram.java) | Very simple approach: convert two str to char array, sort each, & compare each char at each index one by one (satisfied two str must match exactly at each index)
| 2022.7.29 | **890. Find and Replace Pattern** | [Solution](./leetcode/daily_challenge/20220729_q890_find_replace_pattern.java) | see details in helper method comments: basic thinking is to compare index of char in target str one by one: if repititive, the first index of this char must always the same
| 2022.8.1 | **62. Unique Paths** | [Solution](./leetcode/daily_challenge/20220801_q62_unique_path.java) | classical **Dynamic Programming (Dp) problem;** <br> similar question (but changed somehow)) appeared couple times later
| 2022.8.2 | **378. Kth Smallest Element in a Sorted Matrix** | [Solution](./leetcode/daily_challenge/20220802_q378_k_smallest_elemen_in_sorted_mat.java) | Note the use of `count`: must used in this way so that we can keep correct track of the convertred array's index; <br> **Possible optimization:** the current version algorithm is not most optimized and exceed `O(n^2)` (possibly `O(n^3)`)
| 2022.8.3 | **729. My Calendar I** | [Solution](./leetcode/daily_challenge/20220803_q729_my_calendar_I.java) | **NOTE** the way build the calendar constructor: the use of a list consist of array.
| 2022.8.4 | **858. Mirror Reflection** | [Solution](./leetcode/daily_challenge/20220804_q858_Mirror_reflection.java); <br>[Explanation](https://leetcode.com/problems/mirror-reflection/discuss/2376191/C%2B%2B-Java-Python-or-Faster-then-100-or-Full-explanations-or) | **Pretty stupid question; less possible appear on interview**; <br>  Simple mathematic problem, just need to find out the cases when fall onto mirror 1 & cases when fall onto mirror 2. See explanation page for review.
| 2022.8.5 | **377. Combination Sum IV** | [Solution](./leetcode/daily_challenge/20220805_q377_comb_sum_IV.java); <br> [Explanation](https://leetcode.com/problems/combination-sum-iv/discuss/2381079/Java-or-1ms-or-DP-or-Top-Down-or-memoization-or-easy) | classical **Dynamic Programming (Dp) problem;** <br> very genius algorithm as described in **explanation** (make sure to **double check!**)
| 2022.8.6 | **458. Poor Pigs** | [Solution](./leetcode/daily_challenge/20220806_q458_poor_pigs.java)
| 2022.8.16 | **387. First Unique Character in a String** | [Solution](./leetcode/daily_challenge/20220816_q387_first_unique_char_in_str.java) | **NOTE** that this question is better using frequency count: using the array `int[] freq = new int[26]` to keep track of occurence (similar question appeared before); note that if use the counter we need to break the first time found individual occurence alphabet
| 2022.8.17 | **804. Unique Morse Code Words** | [Solution](./leetcode/daily_challenge/20220817_q804_unique_morse_code_words.java) 
| 2022.8.18 | **1338. Reduce Array Size to The Half** | [Solution](./leetcode/daily_challenge/20220818_q1338_reduce_arr_size_to_half.java)
| 2022.8.19 | **659. Split Array into Consecutive Subsequences** | [Solution](./leetcode/daily_challenge/20220819_q659_split_arr_consecutive_seq.java); <br> [Explanation](https://leetcode.com/problems/split-array-into-consecutive-subsequences/discuss/2447452/Java-or-Greedy-or-Just-a-few-lines-or-Explained) | **NOTE:** Review of the arr `int end[]` need to figure out what to do; generally followed personal understanding of the whole question.
| 2022.8.20 | **871. Minimum Number of Refueling Stops** | [Solution](./leetcode/daily_challenge/20220820_q871_min_num_refuel_stop.java) | **Dynamic Programming Question**; Review needed
| 2022.8.21 | **936. Stamping The Sequence** | [Solution](./leetcode/daily_challenge/20220821_q936_stamp_seq.py); <br> [Explanation](https://leetcode.com/problems/stamping-the-sequence/discuss/2456316/85MS-Python-Beats-98-multiple-approaches-Fastest-and-Memory-Efficient) | **Not valuable question for interview**; simple review required 

> ### Leetcode 75 Study Plan
| Date | Questions | Difficulties | Solutions | Notes
| --- | --- | --- | --- | ---
| 2022.7.2 | **1480. Running Sum of 1d Array** | *Easy* | [Solution](./leetcode/lc_75q/q1480_running_sum_of_1d_arr.java) | 
| | **724. Find Pivot Index** | *Easy* | [Solution](./leetcode/lc_75q/q724_find_pivot_index.java) | **NOTE** appropriate use of `break`; avoid code keep running, as we want the first satisfied index to be returned.
| 2022.7.3 | **205. Isomorphic Strings** | *Easy* | [Solution](./leetcode/lc_75q/q205_isomorphic_str.java) | **NOTE: NOT ANSWERED QUESTION; NEED REVIEW**
| | **392. Is Subsequence** | *Easy* | [Solution](./leetcode/lc_75q/q392_is_subseq.java) | Note the uses of **two counters**: we traverse on   target str `t`, but when found matched char, we will also increment the counter on subsequence str `s`.
| 2022.7.4 | **21. Merge Two Sorted Lists** | *Easy* | [Solution](./leetcode/lc_75q/q21_merge_two_sorted_list.java) | **Linked-list Node**;  
| | **206. Reverse Linked List** | *Easy* |[Solution](./leetcode/lc_75q/q206_reverse_linked_list.java) | **Linked-list Node**; 
| 2022.7.5 | **876. Middle of the Linked List** | *Easy* | | **Linked-list Node**; 
| | **142. Linked List Cycle II** | *Medium* | [Solution](./leetcode/lc_75q/q142_linked_list_cycle_II.java) | **Linked-list Node**; <br> **Double pointers**, similar question as [q141](./leetcode/double_ptr/q141_linked_list_cycle.java)

> ### Double Pointers
| Questions | Solutions | Notes
| --- | --- | ---
| **1. Two Sum** | [Solution](./leetcode/double_ptr/q1_two_sum.java)
| **88. Merge sort Array**| [Solution](./leetcode/double_ptr/q88_merge_sort_Arr.java)
| **141. Linked list Cycle**| [Solution](./leetcode/double_ptr/q141_linked_list_cycle.java) | Similar question see [q142](./leetcode/lc_75q/q142_linked_list_cycle_II.java)
| **345. Reverse vowels of a String**| [Solution](./leetcode/double_ptr/q345_rev_vowel_str.java)
| **524. Longest word in dictionary** | [Solution](./leetcode/double_ptr/q524_longest_word_in_dict.java)
| **638. Sum of two sqaures**| [Solution](./leetcode/double_ptr/q638_sum_of_two_sqr.java)
| **680. Valid Palindrome**| [Solution](./leetcode/double_ptr/q680_valid_palindrome.java)


> ### Greedy
| Questions | Solutions | Notes
| --- | --- | ---
| **455. Assign cookies** | [Solution](./leetcode/greedy/q455_assign_cookies.java)
| **435. Non-overlapping Intervals**| [Solution](./leetcode/greedy/q435_non-overlap_interval.java) | Similar to 6.29 daily question
| **452. Min Number of Arrow to Burst Ballons** | [Solution](./leetcode/greedy/q452_min_num_arrow.java) | Similar to q435 BUT FAILED COUPLE TIMES; 435 compare upper bound; here we compare lower bound
| **121. Best Time to Buy & Sell Stock**| [Solution](./leetcode/greedy/q121_best_time_sell_stock.java) | 
| **122. Best Time to Buy & Sell Stock II**| [Solution](./leetcode/greedy/q122_best_time_sell_stock_II.java) | basically same as q121, but add another cumulative counter to see if cumulative profit is greater than greatest difference
| **605. Can Place Flowers** | [Solution](./leetcode/greedy/q605_can_place_flowers.java) | Tricky point is the boundary case: need to be carefully handled (add virtual zero in beginning / end case when necessary; <br> see details in comment)
| **392. Is Sequence** |[Solution](./leetcode/greedy/q392_is_sequence.java) | **Dynamic Programming;** <br> NOTE about the comments & algorithm we adopt in this question (useful for avoding repititive char cases)
| **53. Maximum Subarray** | [Solution](./leetcode/greedy/q53_max_subarr.java) | NOTE about the buffer & its cleaning step (help avoid only adding positive numbers in the array)
| **763. Partition Labels** | [Explanation](https://leetcode.com/problems/partition-labels/discuss/1868842/JavaC%2B%2B-VISUALLY-EXPLAINEDDDDD!!) | NOTE about using of HashMaps here; <br> **NOT FINISHED; NEED REVIEW EXPLANATION!**


> ### Sequencing (K-th element question)
| Questions | Solutions | Notes
| --- | --- | ---
| **347. Top K Frequent Elements** | [Solution](./leetcode/sequencing/q347_top_k_frequent_elem.java) <br> [Explanation](https://leetcode.com/problems/top-k-frequent-elements/discuss/2193776/Easy-JAVA-solution-with-clear-explanation-using-PriorityQueue) | Note how to use the HashMap (as the "dictionary" in python, as well as the priority queue (instead of useing bucket sort, use the priority queue and ranked each nodes by frequencys) , and grab out the kth top nodes)
| **75. Sort Colors** | [Solution](./leetcode/sequencing/q75_sort_colors.java) | **Dutch flag problem;** <br> Note about the algorithm limitations; see details in code comments
| **451. Sort Characters By Frequency** | [Solution](./leetcode/sequencing/q451_sort_char_by_freq.java) | NOTE the frequent use of **priority queue** & **Hashmap (dict in Python)** NEED to familiarize; <br> see details in coding comments; 

> ### Dynamic Programming (dp)
| Questions | Solutions | Notes
| --- | --- | ---
| **64. Minimum Path Sum** | [Solution](./leetcode/dp/q64_min_path_sum.java) |
| **304. Range Sum Query 2D - Immutable** | [Solution](./leetcode/dp/q304_range_sum_query_2d.java) |
| **1292. Maximum Side Length of a Square with Sum Less than or Equal to Threshold** | [Solution](./leetcode/dp/q1292_max_sidelen.java) |
| **74. Search a 2D Matrix** | [Solution](./leetcode/dp/q74_search_a_2d_matrix.java) | same approach as q240 Search a 2D Matrix II (7.24 daily question); <br> difference in the matrix number characteristics doesn't matter in solving the two questions
| **70. Climbing Stairs** | [Solution](./leetcode/dp/q70_climbing_stair.java) | **Fibonacci**
| **198. House Robber** | [Solution](./leetcode/dp/q198_house_robber.java) |
| **213. House Robber II** | [Solution](./leetcode/dp/q213_house_robber_ii.java)| us q198 solution as the helper method; done a little bit different thing on the base case & usage of helper method
| **303. Range Sum Query - Immutable** | [Solution](./leetcode/dp/q303_range_sum_query_immutable.java) | usage of `private` var; double check the way how the int array object is been initialized (actually to another array), and how to call & utilize it.


> ### Binary Searches 
**P.S.** Many of these questions hasn't use binary search, but may be more intuitive to understand.

| Questions | Solutions | Notes
| --- | --- | ---
| **34. Find First and Last Position of Element in Sorted Array**| [code from others](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/discuss/2228113/Java-100-Faster) | **NOTE: NOT UNDERSTAND QUESTION**: why run while loop two times (exact same structure) can help get the left tail & right tail of the desired element index? <br> binary search IS useful here.
| **69. Find square root of (x)**| [Solution](./leetcode/bin_search/q69_sqrt(x).java) | intuitively solve using `Math.sqrt()`
| **153. Find Minimum in Rotated Sorted Array** | [Solution](./leetcode/bin_search/q153_find_min_num_in_rotated_sorted_arr.java) | confused what "rotate" do here, as no requirement of outputing anything related; <br> compare adjacent element is more intuitive to understand here;
| **278. First Bad Version** | [Solution](./leetcode/bin_search/q278_first_bad_ver.java) | binary search here is shown to be very intuitive & useful; <br> because the true version can only be the last version (**understand correctly: if current mid ver is false, then correct version must be appear on later version (so update `start = mid + 1`)**), we can use this property to implement the bin search algorithm
| **540. Single Element in a Sorted Array** | [Solution](./leetcode/bin_search/q540_single_elemen_in_sorted_arr.java) | Similar usage of `prev` and `next` var as in greedy question q605 to avoid `indexOutofBound Exception`; <br> the single element in a sorted array must be different from their neighbours (make sure to set different number for start & end case); <br> see details in code
| **744. Find Smallest Letter Greater Than Target** |[Solution](./leetcode/bin_search/q744_smallest_char_greater_target.java) | both **binary search** & **index-by-index comparing** code provided; but binary search also seems reasonable here as the given array is **sorted**

> ## Mathematical problem:
1. Greatest Common Divisor (GCD): (gcd should be a built in method)
```java
int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}
```
2. Lowest Common Multiple (LCM): a * b / gcd(a,b)
```java
int lcm(int a, int b) {
    return a * b / gcd(a, b);
}
```

3. **Integral convert (N < 10)** General code (e.g. in Leetcode q504, in java)
```java
class Solution {
    public String convertToBaseN(int num) {
        var result = String.valueOf("");
        var temp = Math.abs(num);
      
        if(temp == 0){ return "0"; }
      
        while(temp > 0) {
            // N is the base we want to use as 
            // our integral (deci, hex, 7-base, bin, etc.)
            result += temp % N;
            temp /= N;
        }
      
        result = new StringBuilder(result).reverse().toString();
      
        return num < 0 ? "-" + result : result;
    }
}
```

4. **Integral convert \>10 cases**:
a. Hexadecimal (q405): 2 methods: built-in method or use bit calculation

**Method 1:** built-in method
```java
public String toHex(int num) {
    return Integer.toHexString(num);  
}
```

**Method 2:** digit conversion:
pending

b. Twenty Hexadecimal (26, A-Z, then AA & AB): [q168](./leetcode/math/q168_excel_sheet_col_title.java)

**NOTE:** when do some number conversions (if need to use similar thing like: `Integer.parseInt(str, base)` or `Long.parseLong()`, directly try to solve out that problem using python int(str, base) to solve possible `NumberFormatException()` may occur in java.)

---------------- up to q415 ---------------------------



> ## Data structure:

The current plan is to implement some data structures that have learned, e.g. rebuild of Dijikstra; perfect BST; 2,3,4 Tree; B-Tree; Hash Table/Map, etc. 

| Data Structures / Algorithms | Implementations | Note
| -- | -- | --
| **Red-Black Tree** | [Implementation](./datastrcuture/RedBlack_Tree/src/RedBlackTree.java) | From CS 400 Assignment
| **Dijikstra Shortest Path** | [Implementation](./datastrcuture/Dijkstra_Shortest_Path/src/CS400Graph.java) | From CS 400 Assignment
| **B+ Tree** |[Implementation]() | CURRENTLY IN PROGRESS

> ## Some useful links
[BucketSort](https://www.geeksforgeeks.org/bucket-sort-2/)

> ## NOTE about algorithm

Some popular algorithm is probably gonna included, e.g. BFS/DFS; A* searching; Greedy; etc.

The repository is actively updating.
Last Edited: 2022.8