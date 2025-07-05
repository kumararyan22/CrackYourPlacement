class Solution {
    public int findLucky(int[] arr) {
        
        int n = arr.length;
        int luckyNum = -1;

        Map<Integer,Integer> map = new HashMap<>();
        for(int ar : arr)
        {
            map.put(ar, map.getOrDefault(ar,0)+1);
        }

        for(int i=0; i<n; i++)
        {
            if(map.get(arr[i]) == arr[i] && luckyNum < arr[i])
            {
                luckyNum = arr[i];
            }
        }

        return luckyNum;


    }
}