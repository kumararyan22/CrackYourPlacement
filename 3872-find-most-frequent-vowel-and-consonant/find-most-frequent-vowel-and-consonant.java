class Solution {
    public int maxFreqSum(String s) {
        
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch , map.getOrDefault(ch,0)+1);
        }

        int maxFreq=0;
        int maxCons=0;

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getKey()=='a'||entry.getKey()=='e'||entry.getKey()=='i'||entry.getKey()=='o'||entry.getKey()=='u')
            {
                maxFreq = Math.max(maxFreq,entry.getValue());
            }
            else
            {
                maxCons = Math.max(maxCons,entry.getValue());
            }
        }

        // if(maxFreq == maxCons)
        // {
        //     return maxFreq;
        // }

        return maxFreq + maxCons;
    }
}