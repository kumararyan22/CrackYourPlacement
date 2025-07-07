class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);

        helper(candidates,target,0,new ArrayList<>(), res);

        return res;
    }

    public static void helper(int[] candidates, int target, int idx,    
           ArrayList<Integer> curr, List<List<Integer>> res)
    {
          if(target == 0)
            {
                res.add(new ArrayList<>(curr));
                return;
            }
            
        for(int i=idx; i<candidates.length; i++)
        {
            if((i==idx || candidates[i-1] != candidates[i]) && candidates[i] <= target)
            {
                curr.add(candidates[i]);
                helper(candidates,target-candidates[i],i+1,curr, res);
                curr.remove(curr.size()-1);
            }
        }
    }
}