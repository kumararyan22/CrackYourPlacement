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
     public ListNode findMid(ListNode head)
     {
        if(head == null)
        {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
     }

     public ListNode reverse(ListNode head)
     {
           if(head == null)
           {
             return null;
           }
           ListNode prev = null;
           ListNode current = head;
           
           while(current != null)
           {
              ListNode next = current.next;
              current.next = prev;
              prev = current;
              current = next;
           }
           return prev;
     }


    public int pairSum(ListNode head) {
        
        ListNode mid = findMid(head);

        ListNode curr = mid.next;
        mid.next = null;
        
        curr = reverse(curr);

        int max = Integer.MIN_VALUE;
        while(curr != null)
        {
            int val = head.val + curr.val;
            if(val > max)
            {
                max = val;
            }

            head = head.next;
            curr = curr.next;
        }

        return max;
    }
}