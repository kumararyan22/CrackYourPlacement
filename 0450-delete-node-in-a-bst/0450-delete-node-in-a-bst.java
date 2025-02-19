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
    public int successor(TreeNode root)
    {
        root = root.right;

        while(root.left != null)
        {
            root = root.left;  //put the value
        }

        return root.val;   //print
    }

    public int predecessor(TreeNode root)
    {
        root = root.left;

        while(root.right != null)
        {
            root = root.right;
        }
        return root.val;
    }


    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null)   //root is empty
        {
            return null;
        }

        if(key < root.val)   //less than root value
        {
            root.left = deleteNode(root.left , key);
        }

        else if(key > root.val)   //greater than root value
        {
            root.right = deleteNode(root.right , key);
        }
        

        else    //search value found then remove value and order maintain
        {
            if(root.left == null && root.right == null)    //first condition
            {
                root = null;
            }

           else if(root.right != null)     //second condition
            {
                root.val = successor(root);   //function calling
                root.right = deleteNode(root.right , root.val);
            }

            else
            {
                root.val = predecessor(root);
                root.left = deleteNode(root.left , root.val);   //again come and delete the node
            }
        }

        return root;
    }
}