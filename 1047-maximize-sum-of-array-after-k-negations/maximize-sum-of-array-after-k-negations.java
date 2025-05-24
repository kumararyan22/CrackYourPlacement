class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++)
        {
            pq.add(nums[i]);
        }

        while(k > 0)
        {
             int top = pq.peek();
             pq.poll();
             top = -top;

             pq.add(top);

             k--;
        }
        
        int sum = 0;
        while(!pq.isEmpty())
        {
            sum += pq.poll();
        }

        return sum;
    }
}