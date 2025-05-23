class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        solve(nums,n,0,list);
        return ans;
    }

    public void solve(int[] nums, int n, int idx,List<Integer> list)
    {
        if(idx == n)
        {
           ans.add(new ArrayList<>(list));
           return;
        }


        list.add(nums[idx]);
        solve(nums,n,idx+1,list);

        list.remove(list.size()-1);
        solve(nums,n,idx+1,list);

    }
}