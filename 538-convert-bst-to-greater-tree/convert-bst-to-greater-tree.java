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
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null)
        {
            return null;
        }

        return greaterBST(root);
    }

    public TreeNode greaterBST(TreeNode root)
    {
        if(root == null)
        {
            return null;
        }
        
        greaterBST(root.right);

        sum += root.val;
        root.val = sum;

        greaterBST(root.left);

        return root;

    }
}