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
        
        int n=preorder.length;
        return recursion(preorder,0,n-1,postorder,0,n-1);
    }

    public TreeNode recursion(int[] pre,int psi,int pei,int[] post,int ppsi,int ppei)
    {
        if(psi > pei)
        {
            return null;
        }

        TreeNode root = new TreeNode(pre[psi]);
        if(psi == pei)
        {
            return root;
        }

        int idx = ppsi;
        while(post[idx] != pre[psi+1])
        {
            idx++;
        }

        int tlen = idx-ppsi+1;
        
        root.left = recursion(pre,psi+1,psi+tlen , post,ppsi,idx);
        root.right = recursion(pre,psi+tlen+1,pei , post,idx+1,ppei-1);

        return root;
    }
}