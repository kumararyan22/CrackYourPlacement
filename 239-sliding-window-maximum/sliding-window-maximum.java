class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;

        int[] ans = new int[n-k+1];
        int idx=0;

        int i=0;
        int j=0;
        Deque<Integer> dq = new LinkedList<>();

        while(j < n)
        {
            if(dq.isEmpty())
            {
                dq.add(nums[j]);
            }
            else 
            {
                while(dq.size()>0 && dq.peekLast() < nums[j])
                {
                    dq.removeLast();
                }
                dq.add(nums[j]);
            }

            if(j-i+1 == k)
            {
                ans[i] = dq.peek(); 

                if(nums[i] == dq.peek())
                {
                    dq.removeFirst();
                }
                i++;
            }
            j++;
            
        } 

        return ans;
    }
}