class Solution {
    public int countCharacters(String[] words, String chars) {
        
        HashMap<Character , Integer> charCount = new HashMap<>();
        for(char ch : chars.toCharArray())
        {
            charCount.put(ch , charCount.getOrDefault(ch,0)+1);
        }
        
        int length = 0;

        for(String word : words)
        {
            HashMap<Character,Integer> wordCount = new HashMap<>();
            for(char ch : word.toCharArray())
            {
                wordCount.put(ch , wordCount.getOrDefault(ch,0)+1);
            }
             
            boolean check = true;
            for(char ch : wordCount.keySet())
            {
                if(wordCount.get(ch) > charCount.getOrDefault(ch,0))
                {
                    check = false;
                    break;
                }
            }

             if(check == true)
               {
                length += word.length();
               }
        }

        return length;
    }
}