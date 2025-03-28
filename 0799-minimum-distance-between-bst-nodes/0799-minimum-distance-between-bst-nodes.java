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

    int min = Integer.MAX_VALUE;
    TreeNode prev = null;            //same as 530 leetcode num


    public int minDiffInBST(TreeNode root) {
        
        diff(root);
        return min;
        
    }
    public void diff(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        diff(root.left);

        if(prev != null)
        {
            min = Math.min(min , root.val - prev.val); //bst follow so not math.abs use
        }
        prev = root;

        diff(root.right);
    }
}