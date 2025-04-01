
class Solution {
    int m;   //globaly define
    int n;
    public int kthSmallest(int[][] matrix, int k) {
        // int m = matrix.length;      //approach-1
        // int n = matrix[0].length;

        // // Min-heap to keep track of the k smallest elements
        // PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        // // Add elements to the min-heap
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {

        //         minheap.offer(matrix[i][j]);

        //         // Ensure the heap size does not exceed k
        //         if (minheap.size() > k) 
        //         {
        //             minheap.poll(); // Remove the largest element if size exceeds k
        //         }
        //     }
        // }

        // // The top of the min-heap is the k-th smallest element
        // return minheap.peek();


        //   int m = matrix.length;         //approach-2 (not summit only test cases passed)
        //   int n = matrix[0].length;
        //   int ans = -1;

        //   for(int i=0; i<m; i++)
        //   {
        //     for(int j=0; j<n; j++)
        //     {
        //         k--;

        //         if(k == 0)
        //         {
        //             ans = matrix[i][j];
        //         }
        //     }
        //   }
        //  return ans;

    
         
        m = matrix.length;
        n = matrix[0].length;
        int res = -1;

        int low=matrix[0][0];
        int high=matrix[m-1][n-1];

        while(low <= high)
        {
            int mid = low+(high-low)/2;

            if(count(matrix,mid) >= k)
            {
                res = mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return res;

    }

    public int count(int[][] matrix , int mid)
    {
        int cnt = 0;
        int c = m-1;

        for(int i=0; i<n; i++)
        {
            while(c >= 0 && matrix[i][c] > mid)
            {
                c--;
            }

            cnt += c+1;
        }
        return cnt;
    }
}
