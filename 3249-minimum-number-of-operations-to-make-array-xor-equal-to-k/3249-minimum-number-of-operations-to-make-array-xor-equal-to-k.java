class Solution {
    public int minOperations(int[] nums, int k) {
        
        int totalXOR = 0;

        for(int num : nums)
        {
            totalXOR = totalXOR ^ num;
        }

        int diff = totalXOR ^ k;


        int count = 0;
        while(diff > 0)
        {
            count += diff & 1;
            diff >>= 1;
        }

        return count;
    }
}