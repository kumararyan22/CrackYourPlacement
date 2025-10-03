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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode dummy1 = new ListNode(-1);
        ListNode odd = dummy1;
        ListNode dummy2 = new ListNode(-1);
        ListNode even = dummy2;

        ListNode curr = head;
        boolean toggle = true;

        while(curr != null)
        {
            if(toggle == true)
            {
                odd.next = new ListNode(curr.val);
                odd = odd.next;
                curr = curr.next;
            
            }
            else
            {
                even.next = new ListNode(curr.val);
                even = even.next;
                curr = curr.next;
            }

            toggle = !toggle;
        }

        odd.next = dummy2.next;

        return dummy1.next;
    }
}