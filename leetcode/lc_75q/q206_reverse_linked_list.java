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

// e.g. move: when curr head = 1
        // store current head's next node into var "nextnode" (our next node to traverse)
        // set curr.next = prev (head becomes tail, so no next node, NULL)
        // set next.prev(which is curr, the var "prev" in code) = curr
        // set next node to traverse as next node
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode nextnode = head.next;
            head.next = prev;
            prev = head;
            head = nextnode;
        }
        return prev;
    }
}