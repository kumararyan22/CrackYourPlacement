class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> temp = new ArrayList<>();
        for (int i = 1; i <= n; i++)
        {
            temp.add(String.valueOf(i));
        }

        Collections.sort(temp);

        List<Integer> result = new ArrayList<>();
        for (String s : temp) 
        {
            result.add(Integer.parseInt(s));
        }

        return result;
    }
}
