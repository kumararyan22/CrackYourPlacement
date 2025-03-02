
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[][] ans = new int[n1 + n2][2]; // Maximum size can be n1 + n2
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < n1 && j < n2) 
        {
            if (nums1[i][0] == nums2[j][0]) 
            {
                ans[k++] = new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]};
                i++;
                j++;
            } 
            else if (nums1[i][0] < nums2[j][0]) 
            {
                ans[k++] = nums1[i];
                i++;
            } 
            else 
            {
                ans[k++] = nums2[j];
                j++;
            }
        }
        
        // Add remaining elements
        while (i < n1) 
        {
            ans[k++] = nums1[i];
            i++;
        }
        while (j < n2) 
        {
            ans[k++] = nums2[j];
            j++;
        }
        
        return Arrays.copyOf(ans, k);// Resize the array to fit merged elements
    }

}
