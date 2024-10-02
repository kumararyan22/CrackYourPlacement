
class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;
        int l = 1;
        int r = 1;
        int max = nums[0];

        // Traverse from the left to right
        for (int i = 0; i < n; i++) {
            l *= nums[i];
            max = Math.max(max, l);  // Update max after multiplying
            if (l == 0) {
                l = 1;  // Reset l when encountering zero
            }
        }

        // Traverse from the right to left
        for (int i = n - 1; i >= 0; i--) {
            r *= nums[i];
            max = Math.max(max, r);  // Update max after multiplying
            if (r == 0) {
                r = 1;  // Reset r when encountering zero
            }
        }

        return max;

    }
}
