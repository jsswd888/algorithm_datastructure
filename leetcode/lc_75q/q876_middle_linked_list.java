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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode start = head;
        
        // get length of linked list
        while (head != null) {
            count++;
            head = head.next;
        }

        // because it need the second middle one in even len case, we 
        // can directly use the count / 2 here. The mechanism is: start from
        // head node, go to next node count / 2 times, get the next node of the 
        // node currently at count / 2 index (if is even len (6), we get 4; if is odd
        // len (5), we get (len-1) / 2 + 1 position (3))
        for (int i = count / 2; i > 0; i--) {
            start = start.next;
        }
        
        return start;
    }
}