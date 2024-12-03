class Solution {
    public String addSpaces(String s, int[] spaces) 
    {
        StringBuilder sb = new StringBuilder();
        int idx = 0;  // Index for the spaces array

        for (int i = 0; i < s.length(); i++) 
        {
            // If the current index matches the next space position, add a space
            if (idx < spaces.length && i == spaces[idx]) 
            {
                sb.append(" ");
                idx++;  // Move to the next space index
            }
            sb.append(s.charAt(i));  // Append the current character
        }

        return sb.toString();
    }
}
