class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int[] res = new int[n1];

        Map<Integer , Integer> hm = new HashMap<>();   //store privious and next greater ele combination
        Stack<Integer> st = new Stack<>();    

        for(int i=0; i<nums2.length; i++)
        {
            while(!st.isEmpty() && st.peek() < nums2[i])   //if stack is not empty and stack top value less than nums2[i]
            {
                hm.put(st.pop() , nums2[i]);   //top ele delete 
            }

            st.push(nums2[i]);
        }

        for(int i : st)   //if no greater element 
        {
            hm.put(i , -1);
        }

        for(int i =0; i<n1; i++)   //get the value
        {
            res[i] = hm.get(nums1[i]);
        }

        return res;
    }
}