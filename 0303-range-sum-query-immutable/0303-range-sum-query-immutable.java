class NumArray {
    
    int[] prefix;
    public NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n];

        prefix[0] = nums[0];
        for(int i=1; i<n; i++)
        {
            prefix[i] = prefix[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        
         int sum;
         if(left == 0)
         {
            sum = prefix[right];
         }   
         else
         {
            sum = prefix[right] - prefix[left - 1];
         }   

         return sum;  
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */