class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        Set<Character> set = new HashSet<>();
        for(char ch : brokenLetters.toCharArray())
        {
            set.add(ch);
        }
        int count=0;
        
        String[] word = text.split(" ");
        
        for(int i=0; i<word.length; i++)
        {
            boolean toggle = true;
            for(char ch : word[i].toCharArray())
            {
                if(!set.contains(ch))
                {
                    continue;
                }
                else
                {
                    toggle = false;
                    break;
                }
            }
            if(toggle == true)
            {
                count++;
            }
        }
        
        return count;
    }
}