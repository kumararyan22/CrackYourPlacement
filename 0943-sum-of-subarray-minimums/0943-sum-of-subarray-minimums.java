

public class Solution {
    // Function to find the Next Smaller to Left (NSL)
    public int[] NSL(int[] arr, int n) {
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if(st.isEmpty())
            {
                res[i] = -1;
            }
            else
            {
                res[i] = st.peek();
            }

            st.push(i);
        }
        return res;
    }

    // Function to find the Next Smaller to Right (NSR)
    public int[] NSR(int[] arr, int n) {
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return res;
    }

    // Main function to calculate sum of subarray minimums
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long sum = 0;
        int mod = (int) 1e9 + 7;
        int[] s1 = NSL(arr, n);
        int[] s2 = NSR(arr, n);

        for (int i = 0; i < n; i++) {
            int left = i - s1[i];
            int right = s2[i] - i;
            sum = (sum + (long) arr[i] * left * right) % mod;
        }

        return (int) sum;
    }

}
