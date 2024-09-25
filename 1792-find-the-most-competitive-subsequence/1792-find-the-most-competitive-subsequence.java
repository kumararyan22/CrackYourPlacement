class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        
       int n = nums.length;
       Stack<Integer> st = new Stack<>();
       
       for(int i=0; i<n; i++)
       {
         
          int val = nums[i];
          while(st.size() > 0 && nums[i] < st.peek() && n-i-1 >= k-st.size())
          {
            st.pop();
          }

          if(st.size() < k)
          {
             st.push(val);
          }
       }

       int[] res = new int[k];
       int i = k-1;
       while(i >= 0)
       {
        res[i--] = st.pop();
       }


      return res;
    }
}