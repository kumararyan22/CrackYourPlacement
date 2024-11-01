

class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        int count = 1; // Initialize count to 1 to include the first character

        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0)); // Append the first character to result
        
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1))
            {
                count++;
            } else {
                count = 1; // Reset count if the current character is different
            }
            
            // Append the character only if the count is less than 3
            if (count < 3) {
                res.append(s.charAt(i));
            }
        }
        
        return res.toString();
    }
}
