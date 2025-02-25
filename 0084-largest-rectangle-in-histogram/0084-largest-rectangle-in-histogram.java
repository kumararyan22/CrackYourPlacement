

class Pair {
    int heights;
    int index;

    public Pair(int heights, int index) {
        this.heights = heights;
        this.index = index;
    }
}

class Solution {

    public static int[] Left(int[] heights) { // for nearest smaller to left
        int n = heights.length;
        int psedo = -1;
        int[] res1 = new int[n];
        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < n; i++) {
           if(st.size() == 0)
           {
            res1[i] = psedo;
           }
           else if(st.size() > 0 && st.peek().heights < heights[i])
           {
             res1[i] = st.peek().index;
           }
           else
           {
            while(st.size() > 0 && st.peek().heights >= heights[i])
            {
                st.pop();
            }
            if(st.size() == 0)
            {
                res1[i] = psedo;
            }
            else
            {
                res1[i] = st.peek().index;
            }
           }

           st.push(new Pair(heights[i] , i));
        }
        return res1;
    }

    public static int[] Right(int[] heights) { // for nearest smaller to right
        int n = heights.length;
        int psedo = n;
        int[] res2 = new int[n];
        Stack<Pair> st = new Stack<>();
        
        for (int i = n-1; i>=0; i--)
         {
           if(st.size() == 0)
           {
            res2[i] = psedo;
           }
           else if(st.size() > 0 && st.peek().heights < heights[i])
           {
             res2[i] = st.peek().index;
           }
           else
           {
            while(st.size() > 0 && st.peek().heights >= heights[i])
            {
                st.pop();
            }
            if(st.size() == 0)
            {
                res2[i] = psedo;
            }
            else
            {
                res2[i] = st.peek().index;
            }
           }

           st.push(new Pair(heights[i] , i));
        
        
        }
        return res2;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = Left(heights);
        int[] right = Right(heights);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            max = Math.max(max, area);
        }

        return max;
    }
}
