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

    int max = 0;

    public int height(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);
        max = Math.max(max , left+right);   //update max

        return 1 + Math.max(left,right);    //height calculate 
    }

    public int diameterOfBinaryTree(TreeNode root) {

        height(root);
        return max; 
        
    }
}