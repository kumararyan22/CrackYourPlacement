/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal  = root.val;

        if(p.val > parentVal && q.val > parentVal)    //right subTree
        {
            return lowestCommonAncestor(root.right , p,q);
        }

        else if(p.val < parentVal && q.val < parentVal)   //left subTree
        {
            return lowestCommonAncestor(root.left , p,q);
        }

        else   //otherwise root print
        {
            return root;
        }
    }
}