class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int n = nums.length;

        int[] store = new int[10001];
        for(int i=0; i<n; i++)
        {
            store[nums[i]]++;
        }
        
        int ep = 0;
        int cp = 0;

        for(int i=1; i<10001; i++)
        {
            int c =  ep + store[i]*i;
            ep = Math.max(ep , cp);
            cp = c;

        }

        return Math.max(ep,cp);
    }
}