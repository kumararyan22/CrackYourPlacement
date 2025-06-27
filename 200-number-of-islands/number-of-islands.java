class Pair{
    int first;
    int second;

    public Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        
    //     int n = grid.length;         //using DFS
    //     int m = grid[0].length;

    //     int Island = 0;

    //     for(int i=0; i<n; i++)
    //     {
    //         for(int j=0; j<m; j++)
    //         {
    //             if(grid[i][j] == '1')
    //             {
    //                 dfs(grid,i,j,n,m);
    //                 Island++;
    //             }
    //         }
    //     }
    //     return Island;
    // }

    // public void dfs(char[][] grid , int r , int c , int n , int m)
    // {
    //     if(r<0 || r>= n || c<0 || c>= m || grid[r][c] != '1')
    //     {
    //         return;
    //     }

    //     if(grid[r][c] == -1)
    //     {
    //         return;
    //     }

    //     grid[r][c] = '$';   //mark visited

    //     dfs(grid,r+1,c,n,m);
    //     dfs(grid,r-1,c,n,m);
    //     dfs(grid,r,c+1,n,m);
    //     dfs(grid,r,c-1,n,m);


    int m = grid.length;         //using BFS
    int n = grid[0].length;
    boolean[][] vis = new boolean[m][n];  //visited nodes

    int island = 0;
    for(int i=0; i<m; i++)
    {
        for(int j=0; j<n; j++)
        {
           if(grid[i][j] == '1' && vis[i][j] == false)
           {
              bfs(i,j,grid,vis,m,n);
              island++;
           }
        }
    }

    return island;
    }

    static void bfs(int i, int j, char[][] grid, boolean[][] vis, int m, int n)
    {
          vis[i][j] = true;
          Queue<Pair> q = new LinkedList<>();
          q.add(new Pair(i,j));
          
          int[] d_row = {-1,1,0,0};    //top,down,left,right
          int[] d_col = {0,0,-1,1};

          while(!q.isEmpty())
        {
             Pair top = q.poll();
              int row = top.first;
              int col = top.second;

            for(int d=0; d<4; d++)
            {
                int newRow = row + d_row[d];
                int newCol = col + d_col[d];

                if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && 
                grid[newRow][newCol] == '1' && vis[newRow][newCol] == false)
                {
                    vis[newRow][newCol] = true;
                    q.add(new Pair(newRow,newCol));
                }

            }
  
        }

    }


}