class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;

        int[][] tb = new int[m+1][n+1];
        int maxlength = 0;

        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(nums1[i-1] == nums2[j-1])
                {
                    tb[i][j] = 1 + tb[i-1][j-1];
                    maxlength = Math.max(maxlength , tb[i][j]);
                }
                else
                {
                    tb[i][j] = 0;
                }
            }
        }

        return maxlength;

        
     }
}

