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

        for(int i=0; i<n-1; i++)
        {
            currSum += arr[i];

            if(currSum == totalSum/3 && firstIdx == -1)
            {
                firstIdx = i;
            }
            else if(currSum == 2 * totalSum/3 && firstIdx != -1)
            {
                secondIdx =i;
                break;
            }
        }

        if(firstIdx != -1 && secondIdx != -1)
        {
            return true;
        }

        return false;

    }
}