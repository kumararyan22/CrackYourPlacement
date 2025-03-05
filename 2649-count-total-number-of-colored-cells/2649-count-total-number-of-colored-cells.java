class Solution {
    public long coloredCells(int n) {
        
        int time = 1;
        long cell = 1;

        while(time <= n)
        {
            cell += (4*(time-1));
            time++;
        }

        return cell;
    }
}