class Solution {
    public void rotate(int[][] matrix) {

        int m = matrix.length;

        for(int i=0; i<m; i++)
        {
            for(int j=i; j<m; j++)
            {
                int swap = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = swap;

            }
        }

        
        for (int i = 0; i < m; i++) {
	        int left = 0, right = m - 1;
	        while (left < right) {
	            int temp = matrix[i][left];
	            matrix[i][left] = matrix[i][right];
	            matrix[i][right] = temp;
	            left++;
	            right--;
	        }
	    }

        
    }
}