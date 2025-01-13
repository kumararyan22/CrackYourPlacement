class Solution {
    public int minimumLength(String s) {
        
        Map<Character,Integer> mp = new HashMap<>();
        for(char c : s.toCharArray())
        {
            mp.put(c , mp.getOrDefault(c,0)+1);
        }

        int res = 0;
        for(int freq : mp.values())
        {
            if(freq >= 3)
            {
                if(freq % 2 == 0)
                {
                    res += 2;
                }
                else if(freq % 2 != 0)
                {
                    res += 1;
                }
            }
            else
            {
                res += freq;
            }
        }
       
       return res;
    }
}