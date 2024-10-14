class Solution {
    public long maxKelements(int[] nums, int k) {
        
        int n = nums.length;
        long sum = 0;

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n; i++)
        {
            maxheap.add(nums[i]);
        }

        while(k > 0)
        {
            int top = maxheap.poll();
            sum += top;

            int value = (int)Math.ceil((double) top/3);
            maxheap.add(value);

            k--;
        }

        return sum;

    }
}