class Solution {
    public int compress(char[] chars) {

        int n = chars.length;
        int index = 0; 

        int i = 0;
        while (i < n) {
            char currentChar = chars[i];
            int count = 0;

            // Count how many times currentChar repeats
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[index++] = currentChar;

            // Write the count if >1
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // new length of compressed chars
    }
 }
