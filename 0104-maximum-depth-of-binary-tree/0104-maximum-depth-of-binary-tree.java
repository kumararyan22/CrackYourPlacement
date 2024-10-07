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

    public int maxDepth(TreeNode root) {

        return solveMaxlen(root);
        
    }

    public int solveMaxlen(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        
        int left = solveMaxlen(root.left);
        int right = solveMaxlen(root.right);

        int height = 1 + Math.max(left , right);
        ans = Math.max(ans , height);

        return height;
    }  
}

//same as 129 second type method
