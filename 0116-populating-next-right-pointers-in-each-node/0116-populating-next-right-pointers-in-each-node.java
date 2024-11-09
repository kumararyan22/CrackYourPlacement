/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root == null)
        {
            return root;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            if(size == 0)
            {
                return root;
            }

            while(size > 0)
            {
                Node temp;

                if(size > 1)
                {
                     temp = q.peek();
                     q.poll();

                     Node nextAdderess = q.peek();
                     temp.next = nextAdderess;
                }
                else
                {
                    temp = q.peek();
                    q.poll();
                }


                if(temp.left != null)
                {
                    q.add(temp.left);
                }
                if(temp.right != null)
                {
                    q.add(temp.right);
                }
                
                size--;
            }
        }

        return root;
    }
}