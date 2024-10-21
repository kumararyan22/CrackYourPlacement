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
                            //  ***first approach***
// class Solution {

//     public ArrayList<Integer> InOrderTraversal(TreeNode root , ArrayList<Integer> result)
//     {
//         if(root == null)
//         {
//             return result;
//         }
         
//         InOrderTraversal(root.left , result);  //left subtree traversal
//         result.add(root.val);          //root val add
//         InOrderTraversal(root.right , result);   //right subtree traversal

//         return result;

//     }
//     public int kthSmallest(TreeNode root, int k) {
        
//         //store the sorted order values in result
//         ArrayList<Integer> result = InOrderTraversal(root , new ArrayList<>());
//         return result.get(k-1);
        
//     }
// }

                            // ***second approach***

class Solution {
           
           int count = 0;
           int res;

     public int kthSmallest(TreeNode root, int k) {
             
              KthFind(root , k);
              return res;
     }

     public void KthFind(TreeNode root , int k)
     {
        if(root == null)
        {
            return;
        }

       
           KthFind(root.left , k);
        
            count++;
            if(count == k)
            {
            res = root.val;
            return;
            }

           KthFind(root.right , k);
     }
}