class Solution {
    public String removeKdigits(String num, int k) {
        
        if(k >= num.length())
        {
            return "0";
        }

        Stack<Character> st = new Stack<>();

        for(char c : num.toCharArray())
        {
            while(!st.empty() && k > 0 && st.peek() > c)
            {
                st.pop();
                k--;
            }

            st.push(c);
        }

        while(k > 0)
        {
            st.pop();
            k--;
        }

    
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty())
        {
            res.append(st.pop());
        }
        res.reverse();

        while (res.length() > 0 && res.charAt(0) == '0') 
        {
           res.deleteCharAt(0); 
        }

        return res.length() == 0 ? "0" : res.toString();
    }
}  