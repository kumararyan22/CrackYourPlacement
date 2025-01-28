class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        
        // int result = 0;                   //brute force
        // for(int i=left; i<=right; i++)
        // {
        //     result = result & i;
        // }

        // return result;


        while(right > left)
        {
            right = right & (right - 1);
        }
        
        return right;
    }
}