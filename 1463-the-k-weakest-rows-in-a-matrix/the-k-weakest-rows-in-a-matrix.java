class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int m = mat.length;
        int n = mat[0].length;
        
        // Priority Queue to store (soldier count, row index) pairs
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]));

        for(int i=0; i<m; i++)
        {
            int count = 0;
            for(int j=0; j<n; j++)
            {
                if(mat[i][j] == 1)
                {
                    count++;
                }
            }
            pq.add(new int[]{count,i});
        }

        int[] ans = new int[k];
        int idx = 0;
       
        while(k > 0)
        {
            ans[idx++] = pq.poll()[1];
            k--;
        }

        return ans;
    }
}