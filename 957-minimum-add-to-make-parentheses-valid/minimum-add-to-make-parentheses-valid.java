class Solution {
    public int minAddToMakeValid(String s) {
        
        int count=0;

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                st.push('(');
            }
            else
            {
               if(st.isEmpty())
               {
                count++;
               }
               else
               {
                 st.pop();
               }
               
            }
        }

        while(!st.isEmpty())
        {
            st.pop();
            count++;
        }

        return count;
    }
}