class Solution {
    public int subarraySum(int[] nums, int k) {
         
         int n = nums.length;
         Map<Integer , Integer> map = new HashMap<>();
         map.put(0,1);  //0 sum and 1 frequency first put in enpty hashmap
         
         int sum = 0;
         int count  = 0;

         for(int i=0; i<n; i++)
         {
            sum += nums[i];
            int diff = sum - k;  //remaining value check in map

            if(map.containsKey(diff))
            {
                count += map.get(diff);   //get the last frequency and add count variable
            }

            map.put(sum , map.getOrDefault(sum , 0) + 1);  //every iteration add element
         }

         return count;
        
    }
}