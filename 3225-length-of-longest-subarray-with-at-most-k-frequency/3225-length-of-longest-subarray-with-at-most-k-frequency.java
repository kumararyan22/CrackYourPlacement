class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
      int n = nums.length;
      HashMap<Integer,Integer> map = new HashMap<>();  //store the frequency each element

      int i=0;
      int j=0;
      int result = 0;  //(j-i+1)

      while(j < n)
      {
        map.put(nums[j], map.getOrDefault(nums[j],0) + 1);  //first 0 index num - frequency store

        while(i < j && map.get(nums[j]) > k)  //until
        {
            map.put(nums[i], map.get(nums[i]) - 1);
            i++;
        }

        result = Math.max(result , j-i+1);
        j++;
        
      }

      return result;
    }
}