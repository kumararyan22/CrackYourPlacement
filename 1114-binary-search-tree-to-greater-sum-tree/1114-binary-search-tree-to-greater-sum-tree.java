class Solution {
    
    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) 
        {
            return null;
        }

        // Traverse the tree in reverse in-order (right, root, left)
        bstToGst(root.right);
        
        // Update the root node's value with the accumulated sum
        sum += root.val;
        root.val = sum;

        bstToGst(root.left);
        
        return root;   //change same root so return root 
    }
}
