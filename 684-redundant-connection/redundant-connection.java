class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        
        int n = edges.length;
        int[] lastOne = new int[2];
        int[] parent = new int[n + 1];
        int[] rank = new int[n + 1];

        for (int i = 0; i <= n; i++)
        {
            parent[i] = i;
            rank[i] = 0;
        }

        for (int[] edge : edges) 
        {
            if (!union(edge[0], edge[1], parent, rank)) 
            {
                lastOne = edge; // store the redundant edge
            }
        }

        return lastOne;
    }

    public int find(int x, int[] parent) {
        if (x != parent[x]) 
        {
            parent[x] = find(parent[x], parent); // path compression
        }
        return parent[x];
    }

    public boolean union(int x, int y, int[] parent, int[] rank) {
        int parent_x = find(x, parent);
        int parent_y = find(y, parent);

        if (parent_x == parent_y) 
        {
            return false; // cycle found
        }

        if (rank[parent_x] > rank[parent_y]) 
        {
            parent[parent_y] = parent_x;
        }
        else if (rank[parent_x] < rank[parent_y])
        {
            parent[parent_x] = parent_y;
        } 
        else 
        {
            parent[parent_y] = parent_x;
            rank[parent_x]++;
        }

        return true;
    }
}
