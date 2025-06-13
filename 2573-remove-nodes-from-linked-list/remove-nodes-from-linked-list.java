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
    public ListNode removeNodes(ListNode head) {
        
        List<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }

        for(int i=0; i<list.size(); i++)
        {
            while(!st.isEmpty() && st.peek() < list.get(i))
            {
                st.pop();
            }

            st.push(list.get(i));
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(!st.isEmpty())
        {
            curr.next = new ListNode(st.pop());
            curr = curr.next;
        }

        return reverse(dummy.next);
    }

    public ListNode reverse(ListNode node)
    {
        ListNode prev = null;
        ListNode curr = node;

        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

}