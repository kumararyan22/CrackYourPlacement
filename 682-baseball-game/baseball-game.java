class Solution {
    public int calPoints(String[] operations) {
        
        int n = operations.length;
        int sum = 0;
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++)
        {
            if(st.size() >= 2 && operations[i].equals("+"))
            {
                int first = st.pop();
                int second = st.pop();
                st.push(second);
                st.push(first);
                st.push(first + second);
            }
            else if(!st.isEmpty() && operations[i].equals("D"))
            {
                int val = st.peek();
                st.push(2 * val);
            }
            else if(!st.isEmpty() && operations[i].equals("C"))
            {
                st.pop();
            }
            else
            {
              st.push(Integer.parseInt(operations[i]));
            }
        }

         while(!st.isEmpty())
         {
            sum += st.pop();
         }

         return sum;
    }
}