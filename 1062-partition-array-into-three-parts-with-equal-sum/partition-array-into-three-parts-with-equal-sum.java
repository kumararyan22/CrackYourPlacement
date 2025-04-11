class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int n = arr.length;

        int totalSum = 0;
        for(int i=0; i<n; i++)
        {
            totalSum += arr[i];
        }

        if(totalSum % 3 != 0)
        {
            return false;
        }
        
        int target = totalSum / 3;
        int currSum = 0;
        int firstIdx = -1;
        int secondIdx = -1;

        for(int i=0; i<n-1; i++)    //dry run ,it is very simple approach
        {
            currSum += arr[i];

            if(currSum == target && firstIdx == -1)   //if one true not check else if part
            {
                firstIdx = i;
            }
            else if(currSum == 2 * target && firstIdx != -1)
            {
                secondIdx = i;
                break;
            }
        }

        if(firstIdx != -1 && secondIdx != -1)   //it means both index are find whose divide the array 3- perts
        {
            return true;
        }

        return false;

    }
}