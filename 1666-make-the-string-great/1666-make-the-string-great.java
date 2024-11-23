class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray())
         {
            if (!st.isEmpty() && Math.abs(st.peek() - c) == 32)  //corresponding to similar character suntract ascii value is always 32 (e-E == 32)
            {
                st.pop();
            } 
            else 
            {
                st.push(c); 
            }
        }


        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        // Reverse the result since stack order is LIFO
        return result.reverse().toString();
    }
}
