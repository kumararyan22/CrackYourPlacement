 class Pair{
    int heights;
    int index;

    public Pair(int heights , int index)
    {
        this.heights = heights;
        this.index = index;
    }
 }

class Solution {
    public int[] Left(int[] heights) {   // for Largest element Left
        int n = heights.length;
        int pseudo = -1;
        int[] res1 = new int[n];
        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if(st.size() == 0)
            {
                res1[i] = pseudo;
            }
            else if(st.size() > 0 && st.peek().heights < heights[i])
            {
                res1[i] = st.peek().index;
            }
            else
            {
                while(st.size()>0 && st.peek().heights >= heights[i])
                {
                    st.pop();
                }
                if(st.size() == 0)
                {
                    res1[i] = pseudo;
                }
                else
                {
                    res1[i] = st.peek().index;
                }
            }
            
            st.push(new Pair(heights[i], i));
        }
        return res1;
    }

    public int[] Right(int[] heights) {    // for Largest element Right
        int n = heights.length;
        int pseudo = n;
        int[] res2 = new int[n];
        Stack<Pair> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            
            if(st.size() == 0)
            {
                res2[i] = pseudo;
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
                    res2[i] = pseudo;
                }
                else
                {
                    res2[i] = st.peek().index;
                }
            
            }
            st.push(new Pair(heights[i], i));
        }
        return res2;
    }


    public int largestRectangleArea(int[] heights) {   // function define
        int n = heights.length;
        int[] left = Left(heights);
        int[] right = Right(heights);
        int max = 0;

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            max = Math.max(max, area);
        }
        return max;
    }

    public int maximalRectangle(char[][] matrix) {
        
       if (matrix.length == 0) return 0;
        
        int n = matrix.length;
        int m = matrix[0].length;
        int[] heights = new int[m];
        int area = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '0') {
                    heights[j] = 0;
                } else {
                    heights[j] += matrix[i][j] - '0';
                }
            }
            area = Math.max(area, largestRectangleArea(heights));
        }
        return area;
    }
}