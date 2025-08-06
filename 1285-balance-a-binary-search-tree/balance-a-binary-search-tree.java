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
    public TreeNode balanceBST(TreeNode root) {
        
        if(root == null)
        {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);

        return built(list,0,list.size()-1);
    }

    public void inOrder(TreeNode root,  ArrayList<Integer> list)
    {
        if(root == null)
        {
            return;
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);

    }

    public TreeNode built(ArrayList<Integer> list, int left, int right)
    {
        if(left > right)
        {
            return null;
        }

        int mid = (left+right)/2;
        TreeNode node = new TreeNode(list.get(mid));

        node.left = built(list,left,mid-1);
        node.right = built(list,mid+1,right);

        return node;
    }
}