class Solution {
    public int maxDifference(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch , map.getOrDefault(ch,0)+1);
        }

        int maxOdd=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;

        for(int freq : map.values())
        {
            if(freq % 2 == 1)
            {
                maxOdd = Math.max(maxOdd , freq);
            }
            else
            {
                minEven = Math.min(minEven , freq);
            }
        }

        if(maxOdd == -1 || minEven==Integer.MAX_VALUE)
        {
            return -1;
        }

        return maxOdd - minEven;

    }
}