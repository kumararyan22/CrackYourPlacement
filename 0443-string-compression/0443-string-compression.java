class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0; // Final index for compressed array
        int i = 0;

        while (i < n) {
            char currentChar = chars[i];
            int count = 0;

            // Count the occurrences of the current character
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Store the character
            chars[index++] = currentChar;

            // Store the count if greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}
