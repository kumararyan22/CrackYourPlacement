class Solution {    
    public TreeNode invertTree(TreeNode root) {    
        // If the root is null, return null
        if (root == null) {
            return null;
        }

        // Call the reverse method on the root node
       reverse(root);
        return root;
    }

    public void reverse(TreeNode node) {
        if (node == null) {
            return;
        }

        // Swap the left and right subtrees
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        // Recursively call reverse on the left and right children
        reverse(node.left);
        reverse(node.right);
    }
}
