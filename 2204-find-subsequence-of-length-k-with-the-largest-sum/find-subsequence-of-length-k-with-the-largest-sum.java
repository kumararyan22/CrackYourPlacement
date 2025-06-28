class Pair {
    int first;  // value
    int second; // index

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        int n = nums.length;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.first - b.first);   //min heap

        for (int i = 0; i < n; i++) 
        {
            pq.add(new Pair(nums[i], i));

            if (pq.size() > k) 
            {
                pq.poll(); // remove smallest value
            }
        }

        //Store k elements
        List<Pair> list = new ArrayList<>(pq);

        //Sort based on original index to maintain input order
        Collections.sort(list, (a, b) -> a.second - b.second);

        int[] ans = new int[k];
        int idx = 0;
        for (Pair p : list) 
        {
            ans[idx++] = p.first;
        }

        return ans;
    }
}
