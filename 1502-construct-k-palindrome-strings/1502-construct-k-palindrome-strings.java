class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k)
        {
            return false;
        }
        
        Map<Character,Integer> mp = new HashMap<>();
        for(char c : s.toCharArray())
        {
            mp.put(c , mp.getOrDefault(c,0)+1);
        }
        
        int oddCount = 0;
        for(int freq : mp.values())
        {
             if(freq % 2 != 0)
             {
                oddCount++;
             }
        }

        return oddCount <= k;
    }
}