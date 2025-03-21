class Solution {    
    public int[][] construct2DArray(int[] original, int m, int n) {                
        int l = original.length;
        
        // Check if the conversion is possible
        if (m * n != l) {
            return new int[0][0]; // Return an empty 2D array if not possible
        }

        int[][] d = new int[m][n];        
        int idx = 0;

        for (int i = 0; i < m; i++) {            
            for (int j = 0; j < n; j++) {                
                d[i][j] = original[idx++];
            }        
        }

        return d;
    }
}
