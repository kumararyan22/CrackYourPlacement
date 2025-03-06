class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n = grid.length;
        int size = n * n;
        int[] ans = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                map.put(grid[i][j] , map.getOrDefault(grid[i][j],0)+1);
            }
        }
         
       for(int num =1; num <=size; num++)
       {
         if(map.containsKey(num))
         {
            if(map.get(num) == 2)
            {
                ans[0] = num;
            }
         }
         else
         {
            ans[1] = num;
         }
       }

       return ans;
    }
}