class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        Set<Integer> set = new HashSet<>();

        while(i < n1 && j < n2)
        {
            if(nums1[i] == nums2[j])
            {
                set.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }

        int[] ans = new int[set.size()];
        int idx = 0;

        for(int num : set)
        {
            ans[idx++] = num;
        }

        return ans;


    }
}