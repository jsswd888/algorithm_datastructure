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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        
        ListNode leftTail = left; // record al nodes smaller than x
        ListNode rightTail = right; // record all nodes greater than or equal to x
        
        while(head != null){
            // head is the current node; traverse through this singly linked list
            if(head.val < x){
                leftTail.next = head; 
                leftTail = leftTail.next;
            }
            else{
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;
        }
        
        // connect right tail to left tail as required (smaller first, then greater or equal to) 
        leftTail.next = right.next; // right.next is the first node of rightTail
        rightTail.next = null;
        
        return left.next; // return the first node of leftTail
    }
}