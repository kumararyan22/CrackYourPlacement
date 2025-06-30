class Solution {
    public int maxVowels(String s, int k) {
        
        int n = s.length();
        int i=0;
        int j=0;
        int max = 0;
        
        String vowels = "aeiou";
        HashSet<Character> set = new HashSet<>();
        for(char ch : vowels.toCharArray())
        {
            set.add(ch);
        }
        
        int count = 0;
        while(j<n)
        {
            if(set.contains(s.charAt(j)))
            {
                count++;
            }

            while(j-i+1 > k && i<j) 
            {
                if(set.contains(s.charAt(i)))
                {
                    count--;
                }
                i++;
            }

            if(j-i+1 == k)
            {
               max = Math.max(max , count);
            }

            j++;
        }

        return max;
    }
}