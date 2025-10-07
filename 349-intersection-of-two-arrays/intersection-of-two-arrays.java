class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n1=nums1.length;
        int n2=nums2.length;

        Set<Integer> set1 = new HashSet<>();
    
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums2)
        {
             set2.add(num);
        }
        
        for(int i=0; i<n1; i++)
        {
            if(set2.contains(nums1[i]))
            {
                set1.add(nums1[i]);
            }
        }

        int[] ans = new int[set1.size()];
        int idx=0;
        for(int val : set1)
        {
            ans[idx++] = val;
        }
        
        return ans;
    }
}