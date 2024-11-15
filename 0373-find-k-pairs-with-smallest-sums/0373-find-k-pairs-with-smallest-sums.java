class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(int[] i1 , int[] i2)
            {
              return Integer.compare(i1[0] , i2[0]);
            }
        });

        Set<String> vis = new HashSet<>();
        pq.add(new int[]{nums1[0] + nums2[0] , 0 , 0});

        List<List<Integer>> list = new ArrayList<>();

        while(!pq.isEmpty() && k>0)
        {
            int[] arr = pq.poll();
            int index1 = arr[1];
            int index2 = arr[2];

            List<Integer> temp = new ArrayList<>();
            temp.add(nums1[index1]);
            temp.add(nums2[index2]);
            list.add(temp);

            k--;

            if(index2+1 < nums2.length && !vis.contains(index1+ "," +(index2+1)))
            {
                pq.add(new int[]{nums1[index1]+nums2[index2+1] , index1 , index2+1});
                vis.add(index1+","+(index2+1));
            }

            if(index1+1 < nums1.length && !vis.contains((index1+1)+ "," +index2))
            {
                pq.add(new int[]{nums1[index1+1]+nums2[index2] , index1+1 , index2});
                vis.add((index1+1)+","+index2);
            }


        }

        return list;
    }
}