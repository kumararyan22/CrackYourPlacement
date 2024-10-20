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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
         q.add(root);

         while(!q.isEmpty())
         {
            
            int count = q.size();   //size find 
            List<Integer> level = new ArrayList<>();   //level by level store

            for(int i=0; i<count; i++)
            {
                TreeNode x = q.remove();   
                level.add(x.val);   //add level(root)

                if(x.left != null)   //left or right both add in queue
                {
                    q.add(x.left);
                }
                if(x.right != null)
                {
                    q.add(x.right);
                }
            }
            result.add(level);   //last, level add in result list
         }

         return result;
    }
}