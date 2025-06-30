class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
       int[] parent = new int[n];
       int[] rank = new int[n];

       for(int i=0; i<n; i++)
       {
        parent[i] = i;
        rank[i] = 0;
       }

       for(int[] edge : edges)
       {
        union(edge[0],edge[1],parent,rank);
       }

       return find(source,parent) == find(destination,parent);
    }

    public int find(int x, int[] parent)
    {
        if(x == parent[x])
        {
            return x;
        }

        return parent[x] = find(parent[x],parent);
    }

    public boolean union(int x, int y, int[] parent, int[] rank)
    {
        int parent_x = find(x,parent);
        int parent_y = find(y,parent);

        if(parent_x == parent_y)
        {
            return false;
        }

        int rank_x = rank[parent_x];
        int rank_y = rank[parent_y];

        if(rank_x > rank_y)
        {
            parent[parent_y] = parent_x;
        }
        else if(rank_x < rank_y)
        {
            parent[parent_x] = parent_y;
        }
        else
        {
            parent[parent_x] = parent_y;
            rank[parent_y]++;
        }

        return true;
    }
}