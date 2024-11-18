
class Solution {

    // Function to find the Next Smaller to Left (NSL)
    public int[] NSL(int[] arr, int n) {
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
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

    // Function to find the sum of subarray minimums
    public long sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long sum = 0;
        int[] s1 = NSL(arr, n);
        int[] s2 = NSR(arr, n);

        for (int i = 0; i < n; i++) {
            long left = i - s1[i];
            long right = s2[i] - i;
            sum += (long) arr[i] * left * right;
        }
        return sum;
    }

    // Function to find the Next Greater to Left (NGL)
    public int[] NGL(int[] arr, int n) {
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return res;
    }

    // Function to find the Next Greater to Right (NGR)
    public int[] NGR(int[] arr, int n) {
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return res;
    }

    // Function to find the sum of subarray maximums
    public long sumSubarrayMaxs(int[] arr) {
        int n = arr.length;
        long sum = 0;
        int[] s1 = NGL(arr, n);
        int[] s2 = NGR(arr, n);

        for (int i = 0; i < n; i++) {
            long left = i - s1[i];
            long right = s2[i] - i;
            sum += (long) arr[i] * left * right;
        }
        return sum;
    }

    // Function to calculate the range sum of subarrays
    public long subArrayRanges(int[] nums) {
        long maxSum = sumSubarrayMaxs(nums);
        long minSum = sumSubarrayMins(nums);
        return maxSum - minSum;
    }
}
