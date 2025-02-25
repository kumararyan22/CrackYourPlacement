
class Solution {

    private int[] Left(int[] heights) { // Nearest smaller to left
        int n = heights.length;
        int[] res1 = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            res1[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return res1;
    }

    private int[] Right(int[] heights) { // Nearest smaller to right
        int n = heights.length;
        int[] res2 = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            res2[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return res2;
    }

    public int largestRectangleArea(int[] heights) {
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
}
