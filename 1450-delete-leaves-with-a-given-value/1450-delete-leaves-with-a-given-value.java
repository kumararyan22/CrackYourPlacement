

class Solution 
{
    public TreeNode removeLeafNodes(TreeNode root, int target) 
    {
        return solve(root, target);
    }

    public TreeNode solve(TreeNode root, int target) 
    {
        if (root == null) 
        {
            return null;
        }

        root.left = solve(root.left, target);
        root.right = solve(root.right, target);

        if (root.left == null && root.right == null && root.val == target)
        {
            return null;
        }

        return root;
    }
}
