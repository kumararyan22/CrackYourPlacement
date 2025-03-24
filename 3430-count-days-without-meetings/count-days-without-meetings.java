class Solution {
    public int countDays(int days, int[][] meetings) {
        
        Arrays.sort(meetings , (a,b) -> Integer.compare(a[0],b[0]));

        int freeTime = 0;
        int endTime = 0;

        for(int[] meeting : meetings)
        {
            int start = meeting[0];
            int end = meeting[1];

            if(start > endTime + 1)
            {
                freeTime += start - endTime - 1;
            }

            endTime = Math.max(endTime , end);
        }

        if(days > endTime)
        {
            freeTime += days - endTime;
        }


        return freeTime;
    }
}