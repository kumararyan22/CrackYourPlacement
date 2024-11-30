class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
                
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
        {
            map.put(i , map.getOrDefault(i,0)+1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int countFreq = list.size();
        for(int freq : list)
        {
            if(k >= freq)
            {
                k -= freq;
                countFreq--;
            }
            else
            {
                break;
            }
        }

        return countFreq;
    }
}