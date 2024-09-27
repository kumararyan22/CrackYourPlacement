
class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); // Sort the array to find the median

        int median = nums[n / 2]; // Median is the middle element of the sorted array
        int count = 0;

        // Calculate the total number of moves needed to make all elements equal to the median
        for (int i = 0; i < n; i++) {
            count += Math.abs(nums[i] - median);
        }

        return count;
    }
}
