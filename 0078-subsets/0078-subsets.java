class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

         List<Integer> temp = new ArrayList<>();
         solve(nums , 0 , temp);   //function calling
         return res;
        
    }

    private void solve(int[] nums , int idx , List<Integer> temp)  //function define
    {

        if(idx >= nums.length)   //base case
        {
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);   //take the ele (yes)
        solve(nums , idx+1 , temp);
        
        temp.remove(temp.size()-1);    //not take the ele (no)
        solve(nums , idx+1 , temp);

    }
}