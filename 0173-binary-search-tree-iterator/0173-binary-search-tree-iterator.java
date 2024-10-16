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
class BSTIterator {
     
     Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {   
        
        st = new Stack<>();  //dry run best understanding
        TreeNode node = root;   //root val store

        while(node != null)  
        {
            st.push(node);   //push all left node val 
            node = node.left; 
        }
    }
    
    public int next() {
        
        TreeNode node = st.pop();   //stack top val remove
        int val = node.val;   //then add val

        node = node.right;  //and right towards or all left val add in stack
        while(node != null)
        {
            st.push(node);
            node = node.left;
        }

        return val;  //return val
        
    }
    
    public boolean hasNext() {

        if(st.isEmpty())
        {
            return false;
        }

        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */