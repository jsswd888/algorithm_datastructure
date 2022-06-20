/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) {return false;}
        ListNode next = head, next_next = head;

        // double ptr: one is the next node; the other is the next next node
        // if the single linked list has a cycle, the two ptrs will meet at some point
        while (next_next.next != null && next_next.next.next != null){
            next = next.next; // 1 step forward
            next_next = next_next.next.next; // 2 steps forward
            
            // if circular, the second ptr (2 steps forward each time) will catch up the first ptr (1 step forward) finally
            if(next == next_next){
                return true;
            }
        }
        
        return false;
    }
}