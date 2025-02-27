class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++)
        {
            map.put(s.charAt(i) , i);
        }

        int prev = -1;
        int maxLen = 0;

        for(int i=0; i<n; i++)
        {
            maxLen = Math.max(maxLen , map.get(s.charAt(i)));

            if(i == maxLen)
            {
                list.add(maxLen - prev);
                prev = maxLen;
            }
        }

        return list;
    }
}