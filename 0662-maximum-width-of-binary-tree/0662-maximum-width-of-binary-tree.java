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

 class Pair<K, V> {
    private final K Key;
    private final V Value;

    public Pair(K Key, V Value) {
        this.Key = Key;
        this.Value = Value;
    }

    public K getKey() {
        return Key;
    }

    public V getValue() {
        return Value;
    }
}


class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root == null)
        {
            return 0;
        }

        long maxWidth = 0;

        Deque<Pair<TreeNode , Long>> dq = new LinkedList<>();
        dq.add(new Pair<>(root , 0L));

        while(!dq.isEmpty())
        {
            int n = dq.size();
            long left = dq.peekFirst().getValue();
            long right = dq.peekLast().getValue();
             
            maxWidth = Math.max(maxWidth , right-left+1);

            for(int i=0; i<n; i++)
            {
                Pair<TreeNode , Long> currPair = dq.pollFirst();
                TreeNode currVal = currPair.getKey();
                long index =  currPair.getValue();

                if(currVal.left != null)
                {
                    dq.add(new Pair<>(currVal.left , 2*index+1));
                }
                if(currVal.right != null)
                {
                    dq.add(new Pair<>(currVal.right , 2*index+2));
                }


            }

        }

        return (int) maxWidth;
    }
}