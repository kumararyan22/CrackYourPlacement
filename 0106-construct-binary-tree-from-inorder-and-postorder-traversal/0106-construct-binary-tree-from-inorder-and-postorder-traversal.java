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
    int idx;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
    
        int n = postorder.length;
        idx = n-1;
        return solveBT(inorder,postorder,0,n-1);
    }

    public TreeNode solveBT(int[] inorder, int[] postorder, int start, int end)
    {
        if(start > end)
        {
            return null;
        }

        int rootVal = postorder[idx];
        idx--;

        int i = start;
        for(; i<=end; i++)
        {
            if(inorder[i] == rootVal)
            {
                break;
            }
        }

        TreeNode root = new TreeNode(rootVal);
        root.right = solveBT(inorder, postorder, i+1, end);
        root.left = solveBT(inorder, postorder, start, i-1);

        return root;

    }
}