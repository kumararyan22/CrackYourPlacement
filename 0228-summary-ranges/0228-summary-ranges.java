class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;

        int i = 0;
        while (i < n)   //dry run best practice
         {
            int j = i;
            while (j < n - 1 && nums[j] + 1 == nums[j + 1])
            {
                j++;
            }

            if (i == j) 
            {
                list.add(String.valueOf(nums[i]));
            }
             else 
            {
                list.add(nums[i] + "->" + nums[j]);
            }

            i = j + 1;   //update the i next index into j
        }
        return list;
    }
}
