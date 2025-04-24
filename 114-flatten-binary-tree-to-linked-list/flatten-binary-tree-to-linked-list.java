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
    public void flatten(TreeNode root) {
        
        if(root == null)
        {
            return;
        }

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty())
        {
            TreeNode curr = st.pop();

            if(curr.right != null)
            {
                st.push(curr.right);
            }
            if(curr.left != null)
            {
                st.push(curr.left);
            }
            
            if(!st.empty())
            {
              curr.right = st.peek();
            }
            curr.left = null;
            
        }

         



        // if(root == null)     //optimize(striver video simple explain)
        // {
        //     return;
        // }
    
        // while(root != null)    //dry run best solution in copy
        // {
        //     if(root.left != null)   //if not null , so enter
        //     {
        //     TreeNode left = root.left;   
        //     TreeNode curr = left;    //curr indicate new root left

        //     while(curr.right != null)
        //     {
        //         curr = curr.right;   //reach the last right
        //     }

        //     curr.right = root.right;   //Morris Traversal main line
        //     root.left = null;
        //     root.right = left;
        //     }

        //     root = root.right;   //new 
        // }
    }
}