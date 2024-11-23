class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped)
    {
        int n = pushed.length;
        int i=0;
        int j=0;
        Stack<Integer> st = new Stack<>();

        while(i < n)
        {
            if(st.isEmpty() || st.peek() != popped[j])  //either empty or not match push or pop value
            {
                st.push(pushed[i]);
                i++;  
            }

            while(!st.isEmpty() && st.peek() == popped[j])  //until check j < n
              {
                    st.pop();
                    j++;  //j only increment
              }
            
        }

          return st.isEmpty();
    }
}