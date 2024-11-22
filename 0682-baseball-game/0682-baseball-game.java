class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();

        for(String ch : operations)
        {
            if(ch.equals("+") && st.size() >= 2)
            {
                int value1 = st.pop();
                int value2 = st.pop();
                int val = value1 + value2;
                st.push(value2);
                st.push(value1);
                st.push(val);

            }
            else if(ch.equals("D"))
            {
                st.push(st.peek() * 2);
            }
            else if(ch.equals("C"))
            {
                st.pop();
            }
            else
            {
                st.push(Integer.parseInt(ch));
            }
        }

        int sum = 0;
        while(!st.isEmpty())
        {
            sum += st.pop();
        }

        return sum;
    }
}