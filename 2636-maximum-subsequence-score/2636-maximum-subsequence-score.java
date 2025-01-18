

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;

        // Create a list of pairs where each pair contains nums1[i] and nums2[i]
        List<int[]> vec = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vec.add(new int[]{nums1[i], nums2[i]});
        }

        // Sort the pairs based on the second element in descending order
        vec.sort((a, b) -> b[1] - a[1]);

        // Min-heap to keep track of the smallest elements in the top k elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        long kSum = 0;

        // Initialize the heap and calculate the initial k-sum
        for (int i = 0; i < k; i++) {
            kSum += vec.get(i)[0];
            pq.add(vec.get(i)[0]);
        }

        // Initialize the result with the initial product
        long result = kSum * vec.get(k - 1)[1];

        // Iterate over the remaining elements
        for (int i = k; i < n; i++) {
            // Add the current element to kSum and remove the smallest element
            kSum += vec.get(i)[0] - pq.poll();
            pq.add(vec.get(i)[0]);

            // Update the result with the maximum product
            result = Math.max(result, kSum * vec.get(i)[1]);
        }

        return result;
    }
}
