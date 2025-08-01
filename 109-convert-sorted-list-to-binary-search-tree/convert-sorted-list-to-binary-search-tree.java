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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head == null)
        {
            return null;
        }

        return bst(head);
    }

    public TreeNode bst(ListNode head)
    {
        if(head == null)
        {
            return null;
        }
        if(head.next == null)
        {
            return new TreeNode(head.val);
        }

        ListNode midPrev = midPrevFind(head);
        ListNode mid = midPrev.next;
        ListNode rightHead = mid.next;

        midPrev.next = null;
        
        TreeNode root = new TreeNode(mid.val);
        root.left = bst(head);
        root.right = bst(rightHead);

        return root;
    }

    public ListNode midPrevFind(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;

        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }
}