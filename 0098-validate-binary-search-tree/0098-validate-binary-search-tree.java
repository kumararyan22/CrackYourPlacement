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

    ArrayList<Integer> result = new ArrayList<>();

    public void inOrderTraversal(TreeNode node)
    {
        if(node.left != null)
        {
            inOrderTraversal(node.left);   //left side
        }

        result.add(node.val);         // mid(root) store

        if(node.right != null)        //right side
        {
            inOrderTraversal(node.right);
        }
    }


    public boolean isValidBST(TreeNode root) {

        if(root == null)
        {
            return true;
        }
        
        inOrderTraversal(root);    //function calling

        int n = result.size();
        for(int i=0; i<n-1; i++)   
        {
            if(result.get(i) >= result.get(i+1))    //value check not print
            {
                return false;
            }
        }

        return true;
    }
}