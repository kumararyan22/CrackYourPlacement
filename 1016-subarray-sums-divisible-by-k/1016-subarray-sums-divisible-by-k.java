// class Solution {
//     public int subarraysDivByK(int[] nums, int k) {
//         int n = nums.length;
//         int prefixSum = 0;
//         int count = 0;

//         for (int i = 0; i < n; i++) {
//             prefixSum = 0;  // Reset prefix sum for every new starting index
//             for (int j = i; j < n; j++) {
//                 prefixSum += nums[j];
//                 // Check if the current prefix sum is divisible by k
//                 if (prefixSum % k == 0) {
//                     count++;
//                 }
//             }
//         }   //only testcases passes not summit , erroe time limit exteed

//         return count;
//     }
// }



class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // To account for the case when a subarray itself is divisible by k
        
        int totalSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
            
            // Find the remainder of the totalSum when divided by k
            int remainder = totalSum % k;

            // Handle negative remainders to keep them in the range of [0, k-1]
            if (remainder < 0) {
                remainder += k;
            }

            // If the remainder has been seen before, it means there is a subarray
            // between previous occurrence and current index divisible by k
            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }

            // Increment the frequency of the remainder in the map
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}

