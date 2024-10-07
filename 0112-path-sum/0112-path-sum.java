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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return solve(root , 0 , targetSum);
    }

    public boolean solve(TreeNode root , int val , int targetSum)
    {
        if(root == null)
        {
            return false;
        }

        val += root.val;
        if(root.left == null && root.right == null)
        {
            if(val == targetSum)
            {
                return true;
            }
        }

        return solve(root.left , val,targetSum) || solve(root.right , val , targetSum);
    }
}