class Solution {
    public String[] divideString(String s, int k, char fill) {

       int n = (int) Math.ceil((double) s.length() / k);
        String[] ans = new String[n];

        StringBuilder str = new StringBuilder();

        int idx=0;
        for(int i=0; i<s.length(); i++)
        {
            str.append(s.charAt(i));

            if(str.length() == k)
            {
                ans[idx++] = str.toString();
                str.setLength(0);
            }
            
        }

        if(str.length() > 0)
        {
            while(str.length() != k)
            {
                str.append(fill);
            }

            ans[idx++] = str.toString();
        }

        return ans;
    }
}