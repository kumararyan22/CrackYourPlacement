
class Solution {
    public int divide(int dividend, int divisor) {
        // Handle edge cases for overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;

        // Convert both numbers to positive using absolute value
        long dd = Math.abs((long) dividend); // Convert to long to avoid overflow
        long dv = Math.abs((long) divisor);

        int result = 0;

        // Perform the division using subtraction and doubling
        while (dv <= dd) {
            long sum = dv;
            int count = 1;

            // Double the divisor until it surpasses the dividend
            while (sum <= dd - sum) {
                sum += sum;
                count += count;
            }

            result += count;
            dd -= sum;
        }

        // Determine the sign of the result based on the input signs
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            return -result;
        }

        return result;
    }
}
