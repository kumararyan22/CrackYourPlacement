class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int n=nums.length;
        int sum=0;
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;

        Map<Integer,Integer> map = new HashMap<>();

        while(j < n)
        {
            sum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);
        
            while(i < j && map.size() < j-i+1)
            {
                sum -= nums[i];
                map.put(nums[i], map.get(nums[i])-1);
                if(map.get(nums[i]) == 0)
                {
                    map.remove(nums[i]);
                }
                i++;
            }

            max = Math.max(max , sum);
            j++;
        }

        return max;
    }
}