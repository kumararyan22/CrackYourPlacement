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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        
        int n = preorder.length;
        return dfs(preorder,0,n-1 , postorder,0,n-1);
    }

    public static TreeNode dfs(int[] preorder, int pst, int pei , int[] postorder , int ppst, int ppei)
    {
         if(pst > pei)   //base case
         {
            return null;
         }

        TreeNode root = new TreeNode(preorder[pst]);   //root value store
         if(pst == pei)   //if only one value exists
         {
            return root;
         }


         int idx = ppst;
         while(preorder[pst+1] != postorder[idx])   //untill value not find in postorder
         {
            idx++;
         }

         int len = idx - ppst + 1;  //total length(left side)

         root.left = dfs(preorder,pst+1,pst+len  ,  postorder,ppst,idx);     //recursion , dry run
         root.right = dfs(preorder,pst+len+1,pei  ,  postorder,idx+1,ppei-1);

         return root;  //answer

    }
}