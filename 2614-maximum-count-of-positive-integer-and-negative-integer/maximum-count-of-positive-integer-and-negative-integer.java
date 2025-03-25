class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        int negIdx = -1;
        int posIdx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < 0) 
            {
                negIdx = mid;
                left = mid + 1;
            } 
            else if(nums[mid] > 0)
            {
                posIdx = mid;
                right = mid - 1;
            }
            else
            {
                int firstZero = mid;
                int lastZero = mid;

                while(firstZero >= 0 && nums[firstZero] == 0)
                {
                    firstZero--;
                }
                negIdx = firstZero;

                while(lastZero < n && nums[lastZero] == 0)
                {
                    lastZero++;
                }
                posIdx = (lastZero == n) ? -1 : lastZero;
                break;
            }
        }

        int max = Math.max(negIdx + 1, (posIdx == -1) ? 0 : n - posIdx);
        return max;
    }
}
