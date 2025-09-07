class Solution {
    public int[] sumZero(int n) {
        
        int[] ans = new int[n];
        int num=1;

        if(n % 2 == 0)
        {
            boolean toggle=true;
            int idx=0;
            while(idx<n)
            {
                if(toggle==true)
                {
                    ans[idx++]=num;
                }
                else
                {
                    ans[idx++]=-num;
                    num = num + 1;
                }
                toggle = !toggle;
            }
        }
        else
        {
            boolean toggle=true;
            int idx=0;
            while(idx<n-1)
            {
                if(toggle==true)
                {
                    ans[idx++]=num;
                }
                else
                {
                    ans[idx++]=-num;
                    num = num + 1;
                }
                toggle = !toggle;
            }
            ans[idx]=0;
        }

        return ans;
    }
}