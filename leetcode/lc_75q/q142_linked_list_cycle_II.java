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
    public ListNode detectCycle(ListNode head) {
        // if head node is null OR list len = 1
        if(head==null || head.next==null) return null;
        
        // fast-slow type question
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        
        // only iterate when fast node is not null, fast node's next is not null
        // and slow node != fast node (so that iteration can still run)
        while(fast != null && fast.next != null && (slow != fast)){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Case #1: no cycle detected, reach the end of the list
        if(fast == null || fast.next == null) {return null;}
        
        // Case #2: case when there is a cycle (when slow & fast node meet due to 
        // their "speed" difference)
        slow = head;
        // we then run iteration again ("fast" node should be at the other side of the loop)
        while(slow != fast){
            // slow & fast shall finally meet
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}