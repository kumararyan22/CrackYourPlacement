

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;

        Map<Character, Integer> mp = new HashMap<>();

        while(j<s.length())
        {
            char c = s.charAt(j);
            mp.put(c , mp.getOrDefault(c,0)+1);

            //mp.size() < k condition is not necessory 

             if(mp.size() == j-i+1)
            {
                max = Math.max(max , j-i+1);
                j++;
            }
            else if(mp.size() < j-i+1)
             {
                while(mp.size() < j-i+1)
                {
                    char ch = s.charAt(i);
                    mp.put(ch , mp.get(ch)-1);
                    if(mp.get(ch) == 0)
                    {
                        mp.remove(ch);
                    }
                    i++;
                }
                j++;
             }
            
        }

        return max;
      
    }
}
