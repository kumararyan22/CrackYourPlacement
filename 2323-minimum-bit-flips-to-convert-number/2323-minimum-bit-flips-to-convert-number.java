
class Solution {
    public int minBitFlips(int start, int goal) {
        
        int ans = start ^ goal; // XOR to find differing bits
        int count = 0;

        for (int i = 0; i <= 31; i++) 
        {
            if ((ans & (1 << i)) != 0)   // Check if the i-th bit is set
            { 
                count++;
            }
        }

        return count; // Return the count of differing bits
    }
}
