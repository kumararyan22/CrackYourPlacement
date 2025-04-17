class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        String compare1 = build(s);
        String compare2 = build(t);

        return compare1.equals(compare2);
    }

    public String build(String str)
    {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == '#')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else
            {
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : st)
        {
            sb.append(c);
        }

        return sb.toString();
    }

}