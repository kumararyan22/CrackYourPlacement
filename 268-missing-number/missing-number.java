class Solution {
    public int missingNumber(int[] nums) {
        
        // Arrays.sort(nums);     //brute force , i think
        
        // int n = nums.length;
        // for(int i=0; i<n; i++)
        // {
        //     if(nums[i] == i)
        //     {
        //         continue;
        //     }
        //     else
        //     {
        //         return i;
        //     }
        // }
        // return n;

        
        
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++)
        {
            set.add(nums[i]);
        }

        for(int i=0; i<n; i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }

        return n;

    }
}