class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int i=0;
        int j = n-1;

        while(i>=0 && i<m && j>=0 && j<n)
        {
            if(matrix[i][j] ==  target)
            {
                  return true;
                  
            }
            else if(matrix[i][j] > target)
            {
                j--;
            }
            else if(matrix[i][j] < target)
            {
                i++;
            }
        }

        return false;


        
    }
}