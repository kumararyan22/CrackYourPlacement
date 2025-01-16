class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num : nums)
        {
            mp.put(num , mp.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            if(entry.getValue() > n/3)
            {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }
}