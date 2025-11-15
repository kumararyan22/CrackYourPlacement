class Solution {
    public int[] minOperations(String boxes) {
        
        char[] ch = boxes.toCharArray();
        int n=ch.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++)
        {
            int sum=0;
            for(int j=0; j<n; j++)
            {
                if(ch[j] == '1')
                {
                    sum += Math.abs(i-j);
                }
                
            }

            ans[i] = sum;
        }

        return ans;
    }
}