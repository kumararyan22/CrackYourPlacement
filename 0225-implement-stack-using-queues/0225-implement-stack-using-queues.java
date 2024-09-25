
class MyStack {

    // Two queues for the stack implementation
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>(); // Main queue
        q2 = new LinkedList<>(); // Auxiliary queue
    }

    // Push element x onto the stack
    public void push(int x) {
       
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }
        q1.add(x);

        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.poll();
        }

    }

    // Removes the element on top of the stack and returns that element
    public int pop() {
        if (!q1.isEmpty()) {
            return q1.poll(); // Removes and returns the top element
        }
        return -1; // In case of empty stack (edge case)
    }

    // Get the top element without removing it
    public int top() {
        if (!q1.isEmpty()) {
            return q1.peek(); // Returns the top element
        }
        return -1; // In case of empty stack (edge case)
    }

    // Returns whether the stack is empty
    public boolean empty() {
        return q1.isEmpty(); // If q1 is empty, the stack is empty
    }
}

/**
 * Example usage:
 * MyStack obj = new MyStack();
 * obj.push(10);
 * obj.push(20);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
