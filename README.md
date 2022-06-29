> # algorithm_datastructure

This repository keeps track of my Leetcode question progress & couple implementation of learned data structures & algorithms 

> ## Updates
- 6.20 update: double pointer one question left; rest section wait for update
- 6.22: finished doubel pointer section; start with greedy; daily question updated routinely.

> ## Leetcode

I am currently following the following link for leetcode sections:

[LeetCode Question Solution](https://github.com/CyC2018/CS-Notes/blob/master/notes/Leetcode%20%E9%A2%98%E8%A7%A3%20-%20%E7%9B%AE%E5%BD%95.md)

> ### Daily Challenge
| Date | Questions | Solutions | Notes
| --- | --- | --- | ---
|2022.6.17| **968. Binary Tree Cameras**|[Solution](./leetcode/daily_challenge/20220617_q968_bst_camera.java) <br> [Explanation](https://leetcode.com/problems/binary-tree-cameras/discuss/2160273/JAVA-oror-EXPLAINED-oror)| BST; DFS
| 2022.6.19 | **1268. Search Suggestion System**  | [Solution](./leetcode/daily_challenge/20220619_q1268_search_suggestion_sys.java)
| 2022.6.21 | **1262. Furthest Building to Reach** | [Solution](./leetcode/daily_challenge/20220621_q1642_furthest_building.java), <br>[Failed Solution](./leetcode/daily_challenge/20220621_q1642_furthest_building_failed_sol.java) <br> | **Greedy**
| 2022.6.22 | **215. Kth largest element in array** | [Solution](./leetcode/daily_challenge/20220622_q215_kth_largeElem_arr.java) | 
| 2022.6.23 | **630. Course Schedule III**| [Solution](./leetcode/daily_challenge/20220623_q630_course_schedule_III.java) <br> [Explanation](https://leetcode.com/problems/course-schedule-iii/discuss/2185367/Java-or-Greedy-or-Explained) |  **Greedy**
| 2022.6.24 | **1354. Construct target array with multiple sums** | [Solution](./leetcode/daily_challenge/20220624_q1354_constr_arr_with_multi_sum.java) <br> [Explanation](https://leetcode.com/problems/construct-target-array-with-multiple-sums/discuss/2189445/Visual-Explanation-or-JAVA-Max-Heap) | **Max heap**; Priority queue application; done reversely
| 2022.6.25 | **665. Non-decreasing Array**|[Solution](./leetcode/daily_challenge/20220625_q665_non-decreasing_array.java) <br> [Explanation](https://leetcode.com/problems/non-decreasing-array/discuss/2193084/Visual-Explanation-or-JAVA-Greedy) | **Greedy**; <br>  similar to a palindrome question (q345 probably)
| 2022.6.26 | **1423. Max points you can obtain from cards**| [Solution](./leetcode/daily_challenge/20220626_q1423_max_pts_from_cards.java) <br> [Explanation](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/discuss/2197791/Reframing-The-Question-or-JAVA-Explained)| Notice how explanation "shift" the question: change to another way that simpler to code
| 2022.6.27 | **1689. Partitioning Into Minimum Number Of Deci-Binary Numbers**| [Solution](./leetcode/daily_challenge/20220627_q1689_Partitioning_min_deci_bin_num.java)<br> [Explanation](https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/discuss/2202690/One-Main-Observation-%2B-Interview-Tips-or-JAVA-Explained) | Look at the thinking of how to solve the problem -> can be found from observing the given data in the question! <br> notice about the usage of str.charAt(i) - 'num': can actually return int result!
| 2022.6.28 | **1647. Minimum Deletions to Make Character Frequencies Unique** | [Solution](./leetcode/daily_challenge/20220628_q1647_min_deletion_make_char_unique.java) | **Greedy**;<br> NOTE about use of Set (property of contain no duplicate elements)
| 2022.6.29 | **406. Queue Reconstruction by Height**| [Solution](./leetcode/daily_challenge/20220629_q406_queue_reconstr_by_height.java) <br> [Explanation](https://leetcode.com/problems/queue-reconstruction-by-height/discuss/2211641/Visual-Explanation-or-JAVA-Greedy) | **Greedy**; <br> take note of the explanation & comments in the code


> ### Double Pointers Problem
| Questions | Solutions | Notes
| --- | --- | ---
| **1. Two Sum** | [Solution](./leetcode/double_ptr/q1_two_sum.java)
| **88. Merge sort Array**| [Solution](./leetcode/double_ptr/q88_merge_sort_Arr.java)
| **141. Linked list Cycle**| [Solution](./leetcode/double_ptr/q141_linked_list_cycle.java)
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

> ### Sequencing (K-th element question)
TBD

> ## Data structure:

The current plan is to implement some data structures that have learned, e.g. rebuild of Dijikstra; perfect BST; 2,3,4 Tree; B-Tree; Hash Table/Map, etc. 

| Data Structures / Algorithms | Implementations | Note
| -- | -- | --
| **Red-Black Tree** | [Implementation](./datastrcuture/RedBlack_Tree/src/RedBlackTree.java) | From CS 400 Assignment
| **Dijikstra Shortest Path** | [Implementation](./datastrcuture/Dijkstra_Shortest_Path/src/CS400Graph.java) | From CS 400 Assignment

> ## NOTE about algorithm

Some popular algorithm is probably gonna included, e.g. BFS/DFS; A* searching; Greedy; etc.

The repository is actively updating.
Last Edited: 2022.6