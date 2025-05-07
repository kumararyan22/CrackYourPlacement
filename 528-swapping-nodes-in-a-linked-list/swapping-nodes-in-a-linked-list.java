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
    public ListNode swapNodes(ListNode head, int k)
    {
         ListNode start = head;
         int count = 1;

         while(start != null)
         {
            count++;
            start = start.next;
         }

         start = head;  //reset again and starting kth node find
         ListNode end = head;  //temp use , last kth node find

         for(int i=0; i<k-1; i++)
         {
            start = start.next;
         }

         for(int i=0; i<count-k-1; i++)
         {
            end = end.next;
         }

         int swap = start.val;   //swap two node , same head changes
         start.val = end.val;
         end.val = swap;

         return head;
    }
}