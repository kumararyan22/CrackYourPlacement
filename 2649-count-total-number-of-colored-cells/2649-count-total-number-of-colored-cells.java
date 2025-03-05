class Solution {
    public long coloredCells(int n) {
        
        int time = 1;
        long cell = 1;

        while(n > 0)
        {
            cell += (4*(n - 1));
            n--;
        }

        return cell;
    }
}