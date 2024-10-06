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
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        
        solveSum(root , 0);
        return ans;
    }

    public void solveSum(TreeNode root , int val)
    {
        if(root == null)
        {
            return;
        }

        val = val * 10 + (root.val);
        if(root.left == null && root.right == null)
        {
            ans += val;
        }

        solveSum(root.left , val);
        solveSum(root.right , val);
    }
}