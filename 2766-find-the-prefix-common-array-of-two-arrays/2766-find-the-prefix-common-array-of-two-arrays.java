class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int n1 = A.length;
        int[] ans = new int[n1];
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0; i<n1; i++)
        {
            mp.put(A[i], mp.getOrDefault(A[i],0)+1);
            mp.put(B[i], mp.getOrDefault(B[i],0)+1);
            
            int c = 0;
            for(Map.Entry<Integer,Integer> entry : mp.entrySet())
            {
                if(entry.getValue() >= 2)
                {
                    c++;
                }
            }

            ans[i] = c;
        }

        return ans;
    }
}