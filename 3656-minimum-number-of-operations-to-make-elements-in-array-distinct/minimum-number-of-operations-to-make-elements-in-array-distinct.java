class Solution {
    public int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int operation = 0;

        for(int i=0; i<n; i+=3)
        {
            if(check(nums,n,i) == true)
            {
                return operation;
            }
            else
            {
                operation++;
            }
        }

        return operation;
    }

    public boolean check(int[] nums, int n, int idx)
    {
        Set<Integer> set = new HashSet<>();
        for(int j=idx; j<n; j++)
        {
            if(set.contains(nums[j]))
            {
                return false;
            }
            set.add(nums[j]);
        }

        return true;

    }


}