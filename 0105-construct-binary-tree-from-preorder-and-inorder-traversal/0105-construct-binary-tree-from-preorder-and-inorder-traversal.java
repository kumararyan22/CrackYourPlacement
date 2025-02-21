class Solution {
    int idx = 0;   //globaly define

    public TreeNode solve(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) {   //base case
            return null;
        }

        int rootVal = preorder[idx];
        TreeNode root = new TreeNode(rootVal); 
        idx++;  //every iteration increment

        int i = start;
        for (; i <= end; i++) {
            if (inorder[i] == rootVal) {   //if find 
                break;   //then stop this location
            }
        }

        root.left = solve(preorder, inorder, start, i - 1);   //recursion call
        root.right = solve(preorder, inorder, i + 1, end);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        int n = inorder.length;
        return solve(preorder, inorder, 0, n - 1);
    }
}