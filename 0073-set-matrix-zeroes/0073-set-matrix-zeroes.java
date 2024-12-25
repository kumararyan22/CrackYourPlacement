class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] duplicate = new int[m][n];   
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                duplicate[i][j] = matrix[i][j];   //copy element
            }
        }


        for(int a=0; a<m; a++)
        {
            for(int b=0; b<n; b++)
            {
                if(duplicate[a][b] == 0)   //if find
                {
                    for(int i=0; i<n; i++)    //row zeros
                    {
                        matrix[a][i] = 0;
                    }
                    for(int i=0; i<m; i++)   //colum zeros
                    {
                        matrix[i][b] = 0;
                    }
                }
            }
        }
        
    }
}