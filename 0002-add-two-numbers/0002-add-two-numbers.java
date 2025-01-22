
// // Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // To store the result
        ListNode current = dummyHead;
        int carry = 0; // To track the carry value

        // Loop through both lists until both are null
        while (l1 != null || l2 != null) {
            // If l1 or l2 are null, treat their value as 0
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Add the values along with the carry
            int sum = val1 + val2 + carry;
            carry = sum / 10; // Update carry for the next digit
            int digit = sum % 10; // Get the digit to store in the current node

            // Create a new node with the digit
            current.next = new ListNode(digit);
            current = current.next;

            // Move to the next nodes in both lists
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // If there's a leftover carry, add it as a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next; // Return the result list, skipping the dummy head
    }
}
