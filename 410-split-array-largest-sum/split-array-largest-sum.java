class Solution {
    public int splitArray(int[] nums, int k) {
        
        int n =nums.length;

        int start = Integer.MIN_VALUE;  
        for(int i=0; i<n; i++)
        {
           start = Math.max(start , nums[i]);  //start max value in whole array
        }
     
        int end = 0;
        for(int i=0; i<n; i++)
        {
            end += nums[i];  //end all sum array 
        }

    
        int result = -1;

        while(start <= end)  //binary serach
        {
            int maxMid = start + (end - start)/2;

            if(isValid(nums,n,k,maxMid) == true)
            {
                 result = maxMid;  //answer update 
                 end = maxMid - 1;  //it is check any other lowest answer
            }
            else
            {
                start = maxMid + 1;  //otherwise 
            }
        }

        return result;

    }


    public static boolean isValid(int[] nums , int n , int k, int maxMid)
    {
        int part = 1;  //mimimum 1 part devide
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            sum += nums[i];
            if(sum > maxMid)
            {
                part++;
                sum = nums[i];  //new value , new part store
            }
        }

        return part <= k;
    }
}