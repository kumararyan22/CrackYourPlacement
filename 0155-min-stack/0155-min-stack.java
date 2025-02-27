class MinStack {

    int mini;
    Stack<Integer> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.empty())
        {
            mini = val;
        }
        else if(val <= mini)
        {
            st.push(mini);
            mini = val;
        }

        st.push(val);
    }
    
    public void pop() {
        if(st.empty())
        {
            return;
        }

        int temp = st.peek();
        st.pop();
        if(temp == mini && !st.empty())
        {
            mini = st.peek();
            st.pop();
        }
    }
    
    public int top() {
        if(st.empty())
        {
            return -1;
        }

        return st.peek();
    }
    
    public int getMin() {
        if(st.empty())
        {
            return -1;
        }

        return mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */