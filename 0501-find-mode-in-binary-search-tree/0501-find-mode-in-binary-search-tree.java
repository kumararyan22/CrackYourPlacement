

class Solution {
    Map<Integer, Integer> mp = new HashMap<>();

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left); 
        mp.put(root.val, mp.getOrDefault(root.val, 0) + 1); // Fixed incrementing frequency
        inOrder(root.right);
    }

    public int[] findMode(TreeNode root) {
        inOrder(root);
        List<Integer> list = new ArrayList<>();
        int maxFreq = 0;

        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if (it.getValue() > maxFreq) {
                maxFreq = it.getValue();
                list.clear();
                list.add(it.getKey());
            } else if (it.getValue() == maxFreq) {
                list.add(it.getKey());
            }
        }

        // Convert the list to an array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
