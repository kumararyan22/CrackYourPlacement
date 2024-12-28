class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int max = 0;
        int count = 0;

        // Initialize the first window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        max = count;

        // Slide the window across the string
        for (int i = k; i < n; i++) {
            // Remove the character at the left of the window
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            // Add the new character at the right of the window
            if (isVowel(s.charAt(i))) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
