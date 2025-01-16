class Solution {
    public int countPalindromicSubsequence(String s) {
        
        int n = s.length();
        Set<Character> letters = new HashSet<>(26);
        for(int i=0; i<n; i++)
        {
            letters.add(s.charAt(i));  //unique character store
        }

        int result = 0;
        for(char letter : letters)   //one by one unique char iterate
        {
            int left_idx = -1;  //initialize both -1 firstly
            int right_idx = -1;

            for(int i=0; i<n; i++)  //iterate again string
            {
                if(s.charAt(i) == letter)  //if equal
                {
                    if(left_idx == -1)
                    {
                        left_idx = i;  //first time update only
                    }
                    right_idx = i;  //it is again and again update ultil the last index not found same
                }
            }

            Set<Character> set = new HashSet<>(26);
            for(int middle = left_idx+1; middle <= right_idx-1; middle++)  //middle char again new set store (dry run best)
            {
                set.add(s.charAt(middle));
            }

            result += set.size();  //add size of middle char 
        }
       
       return result;
    }
}