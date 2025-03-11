
class Solution {
    public int numberOfSubstrings(String s) 
    {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, res = 0;

        for (int j = 0; j < n; j++) 
        {
            // Add character to the map
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            // Shrink window when all three characters are present
            while (map.size() == 3) 
            {
                res += (n - j);  // Every substring from i to j contributes to result

                // Remove or decrease frequency of 'i' character
                char ci = s.charAt(i);
                map.put(ci, map.get(ci) - 1);
                if (map.get(ci) == 0) 
                {
                    map.remove(ci);
                }
                i++;  // Move `i` forward to find the next valid window
            }
        }
        return res;
    }
}
