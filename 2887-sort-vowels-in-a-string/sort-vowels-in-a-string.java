class Solution {
    public static boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
             return true;
        }
        return false;
    }

    public String sortVowels(String s) {
        
        int n=s.length();
        char[] ch1 = s.toCharArray();
        String vowels = "";

        for(int i=0; i<ch1.length; i++)
        {
            if(isVowel(ch1[i]) == true)
            {
                vowels += ch1[i];
            }
        }

        Character[] ch2 = new Character[vowels.length()];
        for (int i = 0; i < vowels.length(); i++) 
        {
            ch2[i] = vowels.charAt(i);
        }

        Arrays.sort(ch2 , (a,b)-> (a-'A') - (b-'A'));
        
        int idx=0;
        for(int i=0; i<ch1.length; i++)
        {
            if(isVowel(ch1[i]) == true)
            {
                ch1[i] = ch2[idx];
                idx++;
            }
        }

    
        return new String(ch1);
        
    }
}