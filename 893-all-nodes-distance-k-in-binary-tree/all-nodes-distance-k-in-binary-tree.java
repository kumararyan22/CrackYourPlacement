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
    HashMap<TreeNode,TreeNode> parent = new HashMap<>();

    public void inOrder(TreeNode root)
    { 
        if(root == null)
        {
            return;
        }

        if(root.left != null)
        {
            parent.put(root.left , root);
            inOrder(root.left);
        }
        if(root.right != null)
        {
            parent.put(root.right , root);
            inOrder(root.right);
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        List<Integer> res = new ArrayList<>();
        
        inOrder(root);
        helper(target,k,res);

        return res;
    }

    public void helper(TreeNode target, int k, List<Integer> res)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        
        Set<TreeNode> visited = new HashSet<>();
        visited.add(target);

        while(!q.isEmpty())
        {
            int size = q.size();
            if(k == 0)
            {
                break;
            }

            for(int i=0; i<size; i++)
            {
                TreeNode node = q.peek();
                q.poll();

                if(node.left != null && !visited.contains(node.left))
                {
                    q.add(node.left);
                    visited.add(node.left);
                }

                if(node.right != null && !visited.contains(node.right))
                {
                    q.add(node.right);
                    visited.add(node.right);
                }

                if(parent.containsKey(node) && 
                !visited.contains(parent.get(node)))
                {
                    q.add(parent.get(node));
                    visited.add(parent.get(node));
                }
            }
            k--;
        }

        while(!q.isEmpty())
        {
            TreeNode temp = q.peek();
            q.poll();
            res.add(temp.val);
        }
    }
}