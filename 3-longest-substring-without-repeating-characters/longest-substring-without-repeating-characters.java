class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        int max = 0;
        int i=0;
        int j=0;

        Map<Character,Integer> map = new HashMap<>();

        while(j < n)
        {
            char ch1 = s.charAt(j);
            map.put(ch1 , map.getOrDefault(ch1,0)+1);
            
            while(j-i+1 > map.size())
            {
                char ch2 = s.charAt(i);
                map.put(ch2, map.get(ch2)-1);
                if(map.get(ch2) == 0)
                {
                    map.remove(ch2);
                }
                i++;
            }

            max = Math.max(max , j-i+1);

            j++;
        }

        return max;

    }
}