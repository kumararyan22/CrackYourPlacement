class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        helper(candidates,target,0,new ArrayList<>(),res);
        return res;
    }

    public static void helper(int[] candidates, int target, int idx,ArrayList<Integer> list, List<List<Integer>> res)
    {
        if(idx == candidates.length)
        {
            if(target == 0)
            {
                res.add(new ArrayList<>(list));
            }
            return;
        }

        if(candidates[idx] <= target)
        {
            list.add(candidates[idx]);
            helper(candidates,target-candidates[idx],idx,list,res);
            list.remove(list.size()-1);
        }
        
        helper(candidates,target,idx+1,list,res);

    }
}