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

    List<TreeNode> list = new ArrayList<>();

    public void inOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        inOrder(root.left);
        list.add(root);
        inOrder(root.right);
    }

    public TreeNode balanceBST(TreeNode root) {
        
        if(root == null)
        {
            return root;
        }

        inOrder(root);
        
        return buildBST(0 , list.size() - 1);
    }

    public TreeNode buildBST(int start , int end)
    {
        if(start > end)
        {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = list.get(mid);

        node.left = buildBST(start , mid-1);
        node.right = buildBST(mid+1 , end);

        return node;
    }
}