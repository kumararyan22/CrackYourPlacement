class Solution {
    public String removeStars(String s) {
        
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(int i=0; i<n; i++)
        {
            char ch = s.charAt(i);
            
            if(!st.isEmpty() && ch == '*')
            {
                st.pop();
            }
            else if(ch != '*')
            {
                st.push(ch);
            }
    
        }

        StringBuilder res = new StringBuilder();
        while(!st.isEmpty())
        {
            res.append(st.pop());
        }

        return res.reverse().toString();
    }
}