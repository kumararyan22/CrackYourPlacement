class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> prev = new ArrayList<>();

        for(int i=0; i<=rowIndex; i++)
        {
            List<Integer> curr = new ArrayList<>(i+1);   //i+1 for zero index

            for(int j=0; j<=i; j++)
            {
                if(j==0 || j==i)   //first and last colum always 1
                {
                    curr.add(1);
                }
                else
                {
                    curr.add(prev.get(j) + prev.get(j-1));
                }
            }
            prev = curr;

        }

        return prev;
    }
}