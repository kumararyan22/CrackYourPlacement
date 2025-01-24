class Solution {
    public int xorOperation(int n, int start) {
        if(n == 0)
        {
            return 0;
        }

        
        int ans = 0;
        
        for(int i=0; i<n; i++)
        {
            ans ^= (start + 2 * i);
        }

        return ans;
    }
}