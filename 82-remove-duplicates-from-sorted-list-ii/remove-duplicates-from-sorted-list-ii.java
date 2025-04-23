/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Dummy node to handle edge cases like when head itself is a duplicate
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy; // Pointer to track the node before the current node
        ListNode curr = head;

        while (curr != null) {
            // If it's a beginning of duplicates sublist, skip all duplicates
            if (curr.next != null && curr.val == curr.next.val) {
                // Move forward until the end of duplicates sublist
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                // Skip all duplicates
                prev.next = curr.next;
            } 
            else
            {
                // Otherwise, move `prev` to `curr`
                prev = curr;
            }
            
            curr = curr.next;  //always increment
        }

        return dummy.next;
    }
}
