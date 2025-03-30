class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();    //very simple approach

        for(int i=0; i<n; i++)
        {
            map.put(s.charAt(i) , i);   //update last index, if char exist already
        }

        int prev = -1;   //bcz 0 based indexing, 9 - (-1) = 10
        int maxLen = 0;

        for(int i=0; i<n; i++)
        {
            maxLen = Math.max(maxLen , map.get(s.charAt(i)));    //map.get index find

            if(i == maxLen)
            {
                list.add(maxLen - prev);
                prev = maxLen;   //update last index
            }
        }

        return list;
    }
}