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
    public int goodNodes(TreeNode root) {
        
        return helper(root , 0 , Integer.MIN_VALUE);
    }

    public int helper(TreeNode root , int res , int currMax)
    {
        if(root == null)
        {
            return 0;
        }

        int rootAnswer = 0;
         if(root.val >= currMax)
         {
            rootAnswer = 1;
            currMax = root.val;
         }

         int lans = helper(root.left , res, currMax);
         int rans = helper(root.right , res,  currMax);
         return lans + rans + rootAnswer;
    }
}