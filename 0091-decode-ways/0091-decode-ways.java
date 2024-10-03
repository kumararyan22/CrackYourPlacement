class Solution {
    int[] dp = new int[101];  
    public int numDecodings(String s) {
        
        Arrays.fill(dp, -1);

        // Start the recursive decoding from the first character
        return decodeWays(s, 0);
    }

    // Helper method to calculate number of decoding ways
    public int decodeWays(String s, int idx) {
        // Base case: if we reach the end of the string, there's 1 valid way to decode
        if (idx == s.length()) {
            return 1;
        }

        // If the string starts with '0', it's not decodable
        if (s.charAt(idx) == '0') {
            return 0;
        }

        // If this index has already been computed, return the stored value
        if (dp[idx] != -1) {
            return dp[idx];
        }

        // Case 1: Consider a single-digit decoding
        int result = decodeWays(s, idx + 1);

        // Case 2: Consider a two-digit decoding if valid
        if (idx < s.length() - 1) {
            int twoDigit = Integer.parseInt(s.substring(idx, idx + 2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                result += decodeWays(s, idx + 2);
            }
        }

        // Store the result in dp array and return it
        return dp[idx] = result;
    }
}
