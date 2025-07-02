class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        
        int n = s.length();
        Map<Character,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        int i=0;
        int j=0;
        int max = 0;

        while(j < n)
        {
            char ch = s.charAt(j);
            map1.put(ch, map1.getOrDefault(ch,0)+1);

            if(j-i+1 == minSize)
            {
                if(map1.size() <= maxLetters)
                {
                String sub = s.substring(i,j+1);
                map2.put(sub, map2.getOrDefault(sub,0)+1);

                max = Math.max(max , map2.get(sub));
                }


                //shrink the window
                char leftChar = s.charAt(i);
                map1.put(leftChar, map1.get(leftChar)-1);
                if(map1.get(leftChar) == 0)
                {
                    map1.remove(leftChar);
                }
                i++;
            }

            j++;

        }

        return max;
        
    }
}