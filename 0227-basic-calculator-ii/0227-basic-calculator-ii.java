
class Solution {
    public int calculate(String s) {
        Stack<Integer> stNum = new Stack<>(); // Stack to store intermediate results
        int num = 0; // Variable to store current number
        char operator = '+'; // Initially, we assume the operator to be '+'

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If the character is a digit, build the number
            if (Character.isDigit(c))
            {
                num = num * 10 + (c - '0'); // Forming the number from digits
            }

            // If the character is an operator or end of string, process the current number with the operator
            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
                if (operator == '+')
                {
                    stNum.push(num); // Push number onto stack for addition
                } 
                else if (operator == '-')
                {
                    stNum.push(-num); // Push negative number onto stack for subtraction
                } 
                else if (operator == '*') 
                {
                    stNum.push(stNum.pop() * num); // Pop the top number and multiply it with the current number
                }
                 else if (operator == '/') 
                {
                    stNum.push(stNum.pop() / num); // Pop the top number and divide it by the current number
                }
                
                // Update the operator and reset num for the next iteration
                operator = c;
                num = 0;
            }
        }

        // Now sum up everything in the stack to get the final answer
        int sum = 0;
        while (!stNum.isEmpty()) {
            sum += stNum.pop();
        }

        return sum;
    }
}
