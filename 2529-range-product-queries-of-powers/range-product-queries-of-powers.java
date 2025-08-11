class Solution {
    public int[] productQueries(int n, int[][] queries) {
        
        ArrayList<Integer> power = new ArrayList<>();
        int bitValue = 1;

        while(n > 0)
        {
            if((n & 1) == 1)
            {
                power.add(bitValue);
            }
            n = n >> 1;
             bitValue = bitValue << 1;
        }

        int[] ans = new int[queries.length];
        int idx=0;
        long module = 1000000007;

        for(int[] quer : queries)
        {
            int left = quer[0];
            int right = quer[1];
            
            long prod=1;
            for(int i=left; i<=right; i++)
            {
                prod = (prod * power.get(i)) % module;
            }
            ans[idx++]=(int)prod;
            
        }

        return ans;
    }
}