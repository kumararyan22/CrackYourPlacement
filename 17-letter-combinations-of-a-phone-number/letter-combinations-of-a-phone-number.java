class Solution {
    public List<String> letterCombinations(String digits) {
        
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> res = new ArrayList<>();

        helper(digits,0,"",map,res);

        return res;
    }

    public void helper(String digits,int idx,String curr,Map<Character,String> map,List<String> res)
    {
        if(idx == digits.length())
        {
            if(curr != "")
            {
                res.add(curr);
            }
            return;
        }

        char currChar = digits.charAt(idx);   //2
        String currString = map.get(currChar);  //abc

        for(int i=0; i<currString.length(); i++)
        {
            curr += currString.charAt(i);
            helper(digits,idx+1,curr,map,res);
            curr = curr.substring(0,curr.length()-1);   //backtrack, id we reach last condition 
        }
    }
}