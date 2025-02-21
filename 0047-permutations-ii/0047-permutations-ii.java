class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        permute(set, nums, 0);
        
        res.addAll(set);
        return res;
    }

    public static void permute(Set<List<Integer>> set, int[] nums, int start) {
        if (start == nums.length) 
        {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) 
            {
                list.add(num);
            }
            set.add(list);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            permute(set, nums, start + 1); // recursion
            swap(nums, start, i); // backtrack
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    
    }
}