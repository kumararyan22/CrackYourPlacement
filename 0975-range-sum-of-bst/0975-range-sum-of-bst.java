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
    int sum = 0; //global define

    public int rangeSumBST(TreeNode root, int low, int high) {
          
        if(root == null)  //if root empty , return 0
        {
            return 0;
        }
        
        if(root.val >= low && root.val <= high)  //within range , add val or left and right side check
        {
            sum = root.val + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
        }

        else if(root.val < low)  //BST properties use 
        {
            return rangeSumBST(root.right,low,high);
        }

        else if(root.val > high)  //if val greater then high so not check rigth side bcz depth side val increase
        {
            return rangeSumBST(root.left,low,high);
        }

        return sum;
    }
}