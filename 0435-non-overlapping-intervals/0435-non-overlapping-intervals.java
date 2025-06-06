

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        int n = intervals.length;    //very similar N meetings in one room(gfg)
        
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);

        int count = 1;   //minimum one always non-overlapping
        int lastEndTime = intervals[0][1];  

        for(int i=1; i<n; i++)
        {
            if(intervals[i][0] >= lastEndTime)
            {
                count++;
                lastEndTime = intervals[i][1];
            }
        }

        return n - count;
    }
}