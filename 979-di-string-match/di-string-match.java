class Solution {
    public int[] diStringMatch(String s) {
        
        int n = s.length();
        int[] ans = new int[n+1];

        int low=0;
        int high=n;
        int idx=0;

        for(int i=0; i<n; i++)
        {
            if(s.charAt(i) == 'I')
            {
                ans[idx++] = low;
                low++;
            }
            else
            {
                ans[idx++] = high;
                high--;
            }
            
        }

        if(low == high)
        {
            ans[idx] = high;
            
        }


        return ans;
    
    }
}