class Solution {
    public int largestAltitude(int[] gain) {
        
        int n = gain.length;
        int highest = 0;
        int preSum = 0;

        for(int i=0; i<n; i++)
        {
            preSum += gain[i];
            if(highest < preSum)  //peak point find
            {
                highest = preSum;
            }   
        }

        return highest;
    }
}