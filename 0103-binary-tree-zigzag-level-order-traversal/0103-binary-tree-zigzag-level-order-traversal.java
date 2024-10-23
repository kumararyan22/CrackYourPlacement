

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int levelNumber = 0; // To keep track of the level

        while (!q.isEmpty()) 
        {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode x = q.poll();

                // Check level number: even level -> left-to-right, odd level -> right-to-left
                if (levelNumber % 2 == 0)
                {
                    level.add(x.val); // Even level: Add left-to-right
                } 
                else 
                {
                    level.add(0, x.val); // Odd level: Add right-to-left by inserting at the front
                }

                // Add left and right children to the queue
                if (x.left != null) 
                {
                    q.add(x.left);
                }
                if (x.right != null) 
                {
                    q.add(x.right);
                }
            }

            // Increase level number after processing the current level
            levelNumber++;
            result.add(level);
        }

        return result;
    }
}
