class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int lastdroplocation = -1;
        for(int trip[] : trips)
        {
            lastdroplocation = Math.max(lastdroplocation , trip[2]);
        }

        int[] highway = new int[lastdroplocation + 1];
        for(int trip[] : trips)
        {
            highway[trip[1]] += trip[0];
            highway[trip[2]] -= trip[0];
        }
         
        
        if(highway[0] > capacity)
        {
           return false;
        }
        for(int i=1; i<=lastdroplocation; i++)
        {
            highway[i] += highway[i-1];
            if(highway[i] > capacity)
            {
                return false;
            }
        }

        return true;
    }
}