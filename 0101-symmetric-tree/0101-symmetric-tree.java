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
    public boolean check(TreeNode left , TreeNode right)
    {
        if(left == null && right == null)
        {
            return true;
        }
        if(left == null || right == null)   //are not same , one value are different
        {
            return false;
        }
        if(left.val != right.val)
        {
            return false;
        }

        return check(left.left , right.right) && check(left.right , right.left);
    }

    public boolean isSymmetric(TreeNode root) 
    {
        return check(root.left , root.right);  //same to same compare or mirror image compare
    }
}