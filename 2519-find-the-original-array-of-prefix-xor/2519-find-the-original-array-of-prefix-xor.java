class Solution {
    public int[] findArray(int[] pref) {
        
        // int[] ans = new int[pref.length];   //extra space but not include bcz question already given

        // ans[0] = pref[0];

        // for(int i=1; i<pref.length; i++)
        // {
        //     ans[i] = pref[i] ^ pref[i-1];
        // }

        // return ans;


        //*************Second solution*************

        for(int i=pref.length-1; i>0; i--)
        {
            pref[i] = pref[i] ^ pref[i-1];
        }

        return pref;
    }
}