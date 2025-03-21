public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int result = 0;
        for(int i=0; i<32; i++)
        {
            int lsb = n & 1;
            int reverseLSB = lsb << (31-i);
            result = result | reverseLSB;
            n = n >>= 1;
        }

        return result;
    }
}