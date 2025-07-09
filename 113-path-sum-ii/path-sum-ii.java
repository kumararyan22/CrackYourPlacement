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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> res = new ArrayList<>();
       
        helper(root,targetSum,new ArrayList<>(),res);
        return res;
    }

    public void helper(TreeNode root,int targetSum,List<Integer> curr,  List<List<Integer>> res)
    {
         if(root == null)
         {
            return;
         }

         curr.add(root.val);
         targetSum -= root.val;

         if(root.left == null && root.right == null && targetSum==0)
         {
            res.add(new ArrayList<>(curr));
         }

         helper(root.left,targetSum,curr,res);
         helper(root.right,targetSum,curr,res);

         curr.remove(curr.size()-1);
    }
}