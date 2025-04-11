class Solution {
    public int countSymmetricIntegers(int low, int high) {
        
        int Scount = 0;
        
        for(int i=low; i<=high; i++)
        {
           
            String st = Integer.toString(i);

            if(st.length() % 2 != 0) continue;
            int sum1 = 0;
            int sum2 = 0;
            int l =0;
            int r =st.length()-1;

            while(l < r)
            {
                sum1 += st.charAt(l) ;
                sum2 += st.charAt(r) ;
                l++;
                r--;
            }
            if(sum1 == sum2)
            {
                Scount++;
            }
        
        }

        return Scount;

    }
}