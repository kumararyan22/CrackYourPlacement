class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        // int n = nums.length;    //this is brute force
        // List<Integer> ans = new ArrayList<>();
        // HashMap<Integer,Integer> mp = new HashMap<>();

        // for(int num : nums)
        // {
        //     mp.put(num , mp.getOrDefault(num,0)+1);
        // }

        // for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        // {
        //     if(entry.getValue() > n/3)
        //     {
        //         ans.add(entry.getKey());
        //     }
        // }

        // return ans;


        
         int n = nums.length;
         int count1=0;
         int count2=0;
         int candidate1 = -1;
         int candidate2 = -1;

         for(int num : nums)
         {
            if(num == candidate1)
            {
                count1++;
            }
            else if(num == candidate2)
            {
                count2++;
            }
            else if(count1 == 0)
            {
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 == 0)
            {
                candidate2 = num;
                count2 = 1;
            }
            else
            {
                count1--;
                count2--;
            }
         }

         count1 = 0;
         count2 = 0;
         for(int num : nums)
         {
            if(num == candidate1)
            {
                count1++;
            }
            else if(num == candidate2)
            {
                count2++;
            }
         }
 
         List<Integer> ans = new ArrayList<>();
         if(count1 > n/3)
         {
            ans.add(candidate1);
         }
         if(count2 > n/3)
         {
            ans.add(candidate2);
         }

         return ans;
    }
}