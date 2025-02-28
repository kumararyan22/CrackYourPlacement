class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalKamai = 0;
        int totalKharcha = 0;

        for(int i=0; i<n; i++)
        {
            totalKamai += gas[i];
        }
        for(int i=0; i<n; i++)
        {
            totalKharcha += cost[i];
        }

        if(totalKamai < totalKharcha)
        {
            return -1;
        }

        int result_idx = 0;
        int total = 0;

        for(int i=0; i<n; i++)
        {
            total += gas[i] - cost[i];

            if(total < 0)
            {
                result_idx = i+1;
                total = 0;
            }
        }

        return result_idx;
    }
}