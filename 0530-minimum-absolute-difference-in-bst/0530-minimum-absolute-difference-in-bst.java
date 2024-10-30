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
    int min = Integer.MAX_VALUE;  //global define
    TreeNode prev = null;  //prev node track the previous node inorder form

    public int getMinimumDifference(TreeNode root) {
        
        diff(root);
        return min;
    }

    public void diff(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        diff(root.left);   //left visit

        if(prev != null)
        {
            min = Math.min(min , root.val - prev.val);  //min find
        }
        prev = root;  //update prev

        diff(root.right);   //right visit
    }
}