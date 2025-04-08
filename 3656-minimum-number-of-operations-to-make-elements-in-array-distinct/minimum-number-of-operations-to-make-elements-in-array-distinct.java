class Solution {
    public int minimumOperations(int[] nums) {
        
    //     int n = nums.length;     //brute force(codestorywithMIK)
    //     int operation = 0;

    //     for(int i=0; i<n; i+=3)
    //     {
    //         if(check(nums,n,i) == true)
    //         {
    //             return operation;
    //         }
    //         else
    //         {
    //             operation++;
    //         }
    //     }

    //     return operation;
    // }

    // public boolean check(int[] nums, int n, int idx)
    // {
    //     Set<Integer> set = new HashSet<>();
    //     for(int j=idx; j<n; j++)
    //     {
    //         if(set.contains(nums[j]))
    //         {
    //             return false;
    //         }
    //         set.add(nums[j]);
    //     }

    //     return true;




        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int i=n-1; i>=0; i--)
        {
            if(set.contains(nums[i]))
            {
                return (int)Math.ceil((i+1)/3.0);
            }
            set.add(nums[i]);
        }

        return 0;
    }


}