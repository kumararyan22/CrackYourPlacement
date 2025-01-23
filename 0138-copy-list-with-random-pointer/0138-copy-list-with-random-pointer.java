/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null)
        {
            return null;
        }

        Node curr = head;
        while(curr != null)
        {
            Node currNext = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = currNext;

            curr = currNext;
        }



        curr = head;
        while(curr != null && curr.next != null)
        {
            if(curr.random == null)
            {
                curr.next.random = null;
            }
            else
            {
                curr.next.random = curr.random.next;
            }

            curr = curr.next.next;
        }




        Node newhead = head.next;
        Node newCurr = newhead;
        curr = head;

        while(curr != null && newCurr != null)
        {
            curr.next = (curr.next == null)? null : curr.next.next;
            newCurr.next = (newCurr.next == null)? null : newCurr.next.next;

            curr = curr.next;
            newCurr = newCurr.next;
        }

        return newhead;
    }
}