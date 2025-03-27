class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        
        while (i < nums.length) {     //first approach
            // If the number untill is not correct position, perform the swap
            if (nums[i] != nums[nums[i]]) {
                int swap = nums[i];
                nums[i] = nums[swap];
                nums[swap] = swap;
            }
             else 
             {
                i++; // Move to the next index if the number is already in the correct position
             }
        }
        
        // Return the duplicate number
        return nums[0];


        // int n = nums.length;     //second approach
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0; i<n; i++)
        // {
        //     if(set.contains(nums[i]))
        //     {
        //         return nums[i];
        //     }
        //     set.add(nums[i]);
        // }

        // return -1;
    }
}
