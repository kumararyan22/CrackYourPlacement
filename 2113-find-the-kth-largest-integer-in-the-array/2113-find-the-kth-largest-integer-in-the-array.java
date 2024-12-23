
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // Use a min-heap of strings to compare based on numerical values
        PriorityQueue<String> minHeap = new PriorityQueue<>(
            (a, b) -> {
                if (a.length() == b.length()) {
                    return a.compareTo(b); // Lexicographical comparison if lengths are equal
                }
                return Integer.compare(a.length(), b.length()); // Compare lengths
            }
        );

        // Add numbers to the heap
        for (String num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element to keep the size at 'k'
            }
        }

        // The kth largest number is at the top of the min-heap
        return minHeap.peek();
    }
}
