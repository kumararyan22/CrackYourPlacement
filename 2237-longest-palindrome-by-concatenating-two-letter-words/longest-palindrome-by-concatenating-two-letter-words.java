class Solution {
    public int longestPalindrome(String[] words) {
        
        Map<String,Integer> map = new HashMap<>();
        int length = 0;

        for(String word : words)
        {
            char[] arr = word.toCharArray();
            char swap = arr[0];
            arr[0] = arr[1];
            arr[1] = swap;

            String rev = new String(arr);

            if(map.containsKey(rev) && map.get(rev) > 0)
            {
                length += 4;
                map.put(rev,map.get(rev)-1);
            }
            else
            {
                map.put(word, map.getOrDefault(word,0)+1);
            }
        }


        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            String word = entry.getKey();
            int count = entry.getValue();

            if(word.charAt(0) == word.charAt(1) && count >= 1)
            {
                length += 2;
                break;
            }

        }

        return length;
    }
}