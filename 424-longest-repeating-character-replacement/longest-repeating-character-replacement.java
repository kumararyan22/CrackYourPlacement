
class Solution {
    public int characterReplacement(String s, int k) {

        int i=0;
        int j=0;
        int n = s.length();
        int maxrepeate = 0;
        int maxlength = 0;

        Map<Character , Integer> map = new HashMap<>();
    
        while(j < n)
        {
            char c = s.charAt(j);
            map.put(c , map.getOrDefault(c,0)+1);

            maxrepeate = Math.max(maxrepeate , map.get(c));
            int nonrepeate = j-i+1 - maxrepeate;

            while(nonrepeate > k)
            {
                char ch = s.charAt(i);
                map.put(ch , map.get(ch)-1);
                if(map.get(ch) == 0)
                {
                    map.remove(ch);
                }
                i++;
                nonrepeate = j - i + 1 - maxrepeate; // update nonrepeate after adjusting i

            }

            maxlength = Math.max(maxlength , j-i+1); //after update length
            j++;
        }

        return maxlength;
    }
}
