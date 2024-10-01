
class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        // Create a map to store remainder frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array and compute remainder frequencies
        for (int num : arr) {
            int remainder = ((num % k) + k) % k;  // Handle negative numbers
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        // Traverse through the remainder map to check pairings
        for (int remainder : map.keySet()) {
            if (remainder == 0) {
                // For remainder 0, the frequency must be even (self-pairing)
                if (map.get(remainder) % 2 != 0) {
                    return false;
                }
            } else {
                // For remainder r, there should be equal numbers with remainder k - r
                int complement = k - remainder;
                if (!map.get(remainder).equals(map.getOrDefault(complement, 0))) {
                    return false;
                }
            }
        }

        // If all conditions are satisfied, return true
        return true;
    }
}
