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
//  */



class Solution {

    ArrayList<Integer> result = new ArrayList<>();

    public void inOrderTraversal(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        inOrderTraversal(node.left);
        result.add(node.val);
        inOrderTraversal(node.right);
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




// //recursion approach
// class Solution {

//     public boolean isValidBST(TreeNode root) {
    
//         return Check(root , Long.MIN_VALUE , Long.MAX_VALUE);  //min and max between value check
//     }

//     public boolean Check(TreeNode root , long min , long max)
//     {
//         if(root == null)
//         {
//             return true;
//         }

//         if(root.val <= min || root.val >= max)  //if root value less than min value it means it is out of bound value , same greater than
//         {
//             return false;
//         }

//         boolean leftside = Check(root.left , min , root.val);   //min , max(parent.val)
//         boolean rightside = Check(root.right , root.val , max);  //min(parent.val) , max

//         return (leftside && rightside);   //both true so return true otherwise false

//     }
// }
