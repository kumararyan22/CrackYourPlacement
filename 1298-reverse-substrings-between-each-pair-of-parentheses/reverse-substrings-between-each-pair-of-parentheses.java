class Solution {
    public String reverseParentheses(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            if(ch == '(' || (ch >= 'a'&& ch <= 'z'))   //')' not add this bracket
            {
                st.push(ch);
            }
            else   //closing bracket
            {
               ArrayList<Character> list = new ArrayList<>();
               while(!st.isEmpty() && st.peek() != '(')    
               {
                list.add(st.pop());
               }
               st.pop();  //remove the opening bracket
               for(char c : list)
               {
                st.push(c);   //again push
               }
            }
        }

        while(!st.isEmpty())
        {
            res.insert(0,st.pop());    //0 index insert
        }


        return res.toString();
        
    }
}