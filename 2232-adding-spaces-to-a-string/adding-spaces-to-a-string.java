class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        StringBuilder ans = new StringBuilder();
        int i=0;

        for(int val : spaces)
        {
             StringBuilder sb1 = new StringBuilder();
             while(i < val)
             {
                sb1.append(s.charAt(i));
                i++;
             }
               
            ans.append(sb1);
            ans.append(" ");
        }

        StringBuilder sb2 = new StringBuilder();
        while(i < s.length())
        {
            sb2.append(s.charAt(i));
            i++;
        }

        ans.append(sb2);

        return ans.toString();
    }
}