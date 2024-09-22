class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> minheap = new PriorityQueue<>(); // Min heap to store smallest jumps where bricks are used

        for (int i = 1; i < n; i++) {
            int diff = heights[i] - heights[i - 1];

            if (diff > 0) {
                minheap.add(diff); // Add the difference to minheap

                // If more than ladders jumps are stored, we use bricks for the smallest jump
                if (minheap.size() > ladders) {
                    bricks -= minheap.poll(); // Use bricks for the smallest jump
                }

                // If bricks become negative, we cannot move further
                if (bricks < 0) {
                    return i - 1;
                }
            }
        }

        return n - 1; // If all buildings are reachable, return the last index
    }
}
