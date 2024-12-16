
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) 
    {
        while (k-- > 0) 
        {
            // Find the minimum element and its index
            int minIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }
            
            // Multiply the minimum element by the multiplier
            nums[minIndex] *= multiplier;
        }
        
        return nums;
    }
}
