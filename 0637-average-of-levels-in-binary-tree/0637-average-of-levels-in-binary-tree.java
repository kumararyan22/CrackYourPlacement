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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> res = new ArrayList<>();
        if(root == null)
        {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
         q.add(root);

         while(!q.isEmpty())
         {
            int size = q.size();
            double sum = 0;

            for(int i=0; i<size; i++)
            {
                
                TreeNode x = q.poll();
                  sum += x.val;

                if(x.left != null)
                {
                    q.add(x.left);
                }
                if(x.right != null)
                {
                    q.add(x.right);
                }
            }

            res.add(sum / size);
         }

         return res;
    }
}