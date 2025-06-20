class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {

        int preSum = 0;
        Set<Integer> set = new HashSet<>();
        
        for(List<Integer> list : nums)
            {
                int first = list.get(0);
                int second = list.get(1);

                for(int i=first; i<=second; i++)
                    {
                        if(!set.contains(i))
                        {
                            preSum++;
                        }
                        set.add(i);
                    }
            }

        return preSum;
    }
}