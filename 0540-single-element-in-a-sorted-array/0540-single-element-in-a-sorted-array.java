class Solution {
    public int singleNonDuplicate(int[] nums) {
          
        //   *************************** brute force ********************
        //  int n = nums.length;
    
        //  if( n == 1)  //base case 
        //  {
        //     return nums[0];
        //  }

        //  for(int i=0; i<n; i++)
        //  {
        //    if(i == 0)   //first index check
        //    {
        //        if(nums[i] != nums[i+1])
        //        {
        //           return nums[i];
        //        }
        //    }
        //    else if(i == n-1)  //last index check
        //    {
        //        if(nums[i] != nums[i-1])
        //        {
        //          return nums[i];
        //        }
        //    }
        //    else   //middle part check
        //    {
        //       if(nums[i] != nums[i+1] && nums[i] != nums[i-1])
        //       {
        //          return nums[i];
        //       }
        //    }
        //  }

        //  return -1;  //otherwise not find so return -1


        // ********************* optimize and clean code *****************

        int n = nums.length;
        if(n == 1)
        {
            return nums[0];
        }

        if(nums[0] != nums[1])
        {
            return nums[0];
        }
        if(nums[n-1] != nums[n-2])
        {
            return nums[n-1];
        }

        int low=1;
        int high=n-2;

        while(low <= high)
        {
            int mid = low+(high-low)/2;

            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
            {
                return nums[mid];
            }

            if((mid % 2==1) && nums[mid] == nums[mid-1] || (mid % 2==0) && nums[mid] == nums[mid+1])
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }

        return -1;
    }
}