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

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {   //same as 1038
        
        if(root == null)
        {
            return root;
        }

        convertBST(root.right);   //just reverse inorder traversal(on BST)

        sum += root.val;
        root.val = sum;   //update root val

        convertBST(root.left);

        return root;

    }
}