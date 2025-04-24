class Solution {
    public int countCompleteSubarrays(int[] nums) {
        
        // int n = nums.length;
        // Set<Integer> set1 = new HashSet<>();
        // for(int i=0; i<n; i++)
        // {
        //     set1.add(nums[i]);
        // }

        // int size = set1.size();
        // int count = 0;

        // for(int i=0; i<n; i++)
        // {
        //     Set<Integer> set2 = new HashSet<>();
        //     for(int j=i; j<n; j++)
        //     {
        //         set2.add(nums[j]);

        //         if(size == set2.size())
        //         {
        //             count++;
        //         }
        //     }
        // }

        // return count;



        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }

        int i=0;
        int j=0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();

        while(j < n)
        {
            map.put(nums[j] , map.getOrDefault(nums[j],0)+1);
            
            while(set.size() == map.size())
            {
                count += n-j;
                map.put(nums[i], map.get(nums[i])-1);
                if(map.get(nums[i]) == 0)
                {
                    map.remove(nums[i]);
                }

                i++;
            }

            j++;
        }

        return count;

    }
}