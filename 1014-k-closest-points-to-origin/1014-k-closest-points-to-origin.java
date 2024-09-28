class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int n = points.length;

        PriorityQueue<int[]> minheap = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] p1 , int[] p2)
            {
                return (p2[0]*p2[0]+p2[1]*p2[1])- (p1[0]*p1[0]+p1[1]*p1[1]);
            }
        });

        for(int i=0; i<n; i++)
        {
            minheap.add(points[i]);
            if(minheap.size() > k)
            {
                minheap.remove();
            }
        }

        int[][] ans = new int[k][2];
        int i = 0;
        while(!minheap.isEmpty())
        {
            ans[i] = minheap.remove();
            i++;
        }

        return ans;
    }
}