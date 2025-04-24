class Solution {
    public int countCompleteSubarrays(int[] nums) {
        
        int n = nums.length;
        Set<Integer> set1 = new HashSet<>();
        for(int i=0; i<n; i++)
        {
            set1.add(nums[i]);
        }

        int size = set1.size();
        int count = 0;

        for(int i=0; i<n; i++)
        {
            Set<Integer> set2 = new HashSet<>();
            for(int j=i; j<n; j++)
            {
                set2.add(nums[j]);

                if(size == set2.size())
                {
                    count++;
                }
            }
        }

        return count;
    }
}