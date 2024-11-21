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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> seq1 = new ArrayList<>();
        List<Integer> seq2 = new ArrayList<>();

        chekedLeaf(root1 , seq1);
        chekedLeaf(root2 , seq2);

        if(seq1.size() != seq2.size())
        {
            return false;
        }

        for(int i=0; i<seq1.size(); i++)
        {
            if(!seq1.get(i).equals(seq2.get(i)))
            {
                return false;
            }
        }

        return true;

    }

    private void chekedLeaf(TreeNode root , List<Integer> list)
    {
        if(root == null)
        {
            return;
        }

        if(root.left == null && root.right == null)
        {
            list.add(root.val);
        }

        chekedLeaf(root.left , list);
        chekedLeaf(root.right , list);
        return;
    }
}