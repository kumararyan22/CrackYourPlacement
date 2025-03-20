class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int n = nums.length;
        int preSum = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0; i<n; i++)
        {
            preSum += nums[i];
            int diff = preSum - goal;

            if(map.containsKey(diff))
            {
                count += map.get(diff);
            }

            map.put(preSum , map.getOrDefault(preSum,0)+1);
        }

        return count;
    }
}