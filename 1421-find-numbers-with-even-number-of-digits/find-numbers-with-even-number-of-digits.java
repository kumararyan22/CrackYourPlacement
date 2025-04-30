class Solution {
    public int findNumbers(int[] nums) {
        
        int n = nums.length;
        int evenNum = 0;

        for(int num : nums)
        {
            int count = 0;
            while(num > 0)
            {
                num = num /10;
                count++;
            }
            if(count % 2 == 0)
            {
                evenNum++;
            }
        }

        return evenNum;
    }
}