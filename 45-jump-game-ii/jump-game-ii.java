
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;

        // If there's only one element, no jumps are needed
        if (n == 1) return 0;

        // Variables to keep track of the number of jumps
        int jumps = 0; // Number of jumps needed to reach the end
        int currentEnd = 0; // The farthest point that can be reached with the    current number of jumps
        int farthest = 0; // The farthest point that can be reached overall
        
        for (int i = 0; i < n ; i++) {
            // Update the farthest point we can reach
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we reach the end of the range for the current jump
            if (i == currentEnd) 
            {
                jumps++; // We need another jump
                currentEnd = farthest; // Update the range for the next jump
                
                // If we can already reach the last index, break out of the loop
                if (currentEnd >= n - 1) 
                {
                    break;
                }
            }
        }
        return jumps;
    }
}
