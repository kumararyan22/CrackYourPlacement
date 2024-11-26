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
    public ListNode reverse(ListNode head)
    {
        if(head == null)
        {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode removeNodes(ListNode head) {
        
        head = reverse(head);

        ListNode current = head;

        while(current != null && current.next != null)
        {
            if(current.val > current.next.val)
            {
               current.next = current.next.next;
            }
            else
            {
               current = current.next;
            }

        }
        current = current.next;

        head = reverse(head);

        return head;
    }
}