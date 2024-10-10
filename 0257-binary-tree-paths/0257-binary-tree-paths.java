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
    List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        
        if(root == null)
        {
            return new ArrayList<>();
        }
        
        findPath(root , "");
        return list;
    }

    public void findPath(TreeNode root , String val)
    {
        if(root == null)
        {
            return;
        }

        val += root.val;
        if(root.left == null && root.right == null)
        {
            list.add(val);
        }

        findPath(root.left , val + "->");
        findPath(root.right , val + "->");
    }
}