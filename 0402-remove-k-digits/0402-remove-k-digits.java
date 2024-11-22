import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Remove larger digits from the stack to make the number smaller
            while (!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            // Push the current digit into the stack
            st.push(num.charAt(i));
        }

        // If there are still digits to remove, remove them from the end
        while (k > 0 ) 
        {
            st.pop();
            k--;
        }
        

        StringBuilder res = new StringBuilder();
        while (!st.isEmpty())
        {
            res.append(st.pop());   //all val add last to first(LIFO order)
        }
        res.reverse(); // Reverse to get the correct order

        // Remove leading zeros
        int index = 0;
        while (index < res.length() && res.charAt(index) == '0') {
            index++;
        }

        // If result is empty after removing zeros, return "0"
        String result = res.substring(index);
        return result.isEmpty() ? "0" : result;
    }
}
