
class Solution {
    // Perform binary search to find the first 1 in row `r`
    public int binarySearch(int[][] mat, int r) {
        int low = 0;
        int high = mat[0].length - 1;
        int store = mat[0].length;  // Store the index of first 1 found
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mat[r][mid] == 1) {
                store = mid;
                high = mid - 1;  // Search the left part
            } else {
                low = mid + 1;  // Search the right part
            }
        }
        
        int count = mat[0].length - store;  // The count of 1s in this row
        return count;
    }
    
    // Find the row with the maximum number of 1s
    public int[] rowAndMaximumOnes(int[][] mat) {
        // Sorting each row in non-decreasing order (ascending order)
        for (int i = 0; i < mat.length; i++) {
            Arrays.sort(mat[i]);
        }
        
        int maxCount = 0;
        int idx = 0;
        
        // Traverse each row and apply binary search to find the number of 1s
        for (int i = 0; i < mat.length; i++) {
            int count = binarySearch(mat, i);
            if (count > maxCount) {
                maxCount = count;
                idx = i;
            }
        }
        
        // Return the index of the row and the maximum count of 1s
        return new int[]{idx, maxCount};
    }
}
