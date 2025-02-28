class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        int n = hand.length;
        if(n % groupSize != 0)
        {
             return false;
        }

        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        for(int i=0; i<n; i++)
        {
            tmap.put(hand[i] , tmap.getOrDefault(hand[i],0)+1);
        }

        while(!tmap.isEmpty())
        {
            int currNum = tmap.firstKey();

            for(int i=0; i<groupSize; i++)
            {
                if(!tmap.containsKey(currNum + i))
                {
                    return false;
                }

                tmap.put(currNum + i , tmap.get(currNum + i) - 1);
                if(tmap.get(currNum + i) == 0)
                {
                    tmap.remove(currNum + i);
                }
            }
        }

        return true;
    }
}