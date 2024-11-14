import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray())
         {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Check if ransomNote can be constructed from magazine
        for (char c : ransomNote.toCharArray()) 
        {
            if (map.containsKey(c) && map.get(c) > 0) 
            {
                map.put(c, map.get(c) - 1); 
            } 
            else 
            {
                return false; // Character not available in sufficient quantity
            }
        }

        return true; // All characters needed are available in the magazine
    }
}
