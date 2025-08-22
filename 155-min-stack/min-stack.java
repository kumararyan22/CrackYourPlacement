class MinStack {
    
    Stack<Integer> st;
    int mini;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty())
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
    
        int x = st.peek();
        st.pop();
        if(x == mini && !st.isEmpty())
        {
            mini = st.peek();
            st.pop();
        }
    }
    
    public int top() {
        if(st.isEmpty())
        {
            return -1;
        }

        return st.peek();
    }
    
    public int getMin() {
        if(st.isEmpty())
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