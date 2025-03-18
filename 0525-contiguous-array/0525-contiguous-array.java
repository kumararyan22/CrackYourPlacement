
class Solution {
    public int findMaxLength(int[] nums) {
        int res = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , -1);    //zero sum , and -1 index put started hashMap

        int sum = 0;    //very simple, dry run by pepcoding youtube channel
        for(int i=0; i<nums.length; i++)
        {
           if(nums[i] == 0)
           {
            sum += -1;
           }
           else if(nums[i] == 1)
           {
            sum += 1;
           }

           if(map.containsKey(sum))   //if previous find anywhere
           {
            int idx = map.get(sum);  //get the index previous same sum whose find
            int len = i - idx;   //i(current) - idx(previous)
            if(len > res)
            {
                res = len;
            }
            }
            else   //otherwise
            {
                map.put(sum , i); 
            }
           
        }
        return res;
        
    }
}