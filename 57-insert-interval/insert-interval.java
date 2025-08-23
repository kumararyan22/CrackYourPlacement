class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        list.add(newInterval);

        Collections.sort(list, (a,b)-> a[0]-b[0]);
        
        LinkedList<int[]> ll = new LinkedList<>();
        for(int[] interval : list)
        {
            if(ll.isEmpty() || interval[0] > ll.getLast()[1])
            {
                ll.add(interval);
            }
            else
            {
                ll.getLast()[1] = Math.max(ll.getLast()[1], interval[1]);
            }
        }

       return ll.toArray(new int[ll.size()][]);


    }
}