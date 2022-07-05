/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = null; // the head of new sorted list
        ListNode curr = new ListNode();
        
        // only run the sequencing while either lists are non-null (otherwise no means)
        while (list1 != null || list2 != null) {  
            // Case #1: if (1) list 1 = null (only need to take care about list 2 node 
            // copy/paste), as the given nodes are already sorted; or (2), list 1 & 2 both
            // not null, and current list 1 node's value > list 2 node value
            if (list1 == null || list2 != null && list1.val > list2.val){
                // we form list2 -> list2.next; use the list2.next compare with list1
                // in the next round
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            } 
            // Case #2: otherwise, if two nodes have same value or list1 < list2
            else {    
                // we form list1 -> list1.next; use the list1.next compare with list 2 
                // in the next round
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            }
            
            // after sorting, we give the start value back to the first node
            if (first == null) first = curr;
        }
        return first;
    }
}