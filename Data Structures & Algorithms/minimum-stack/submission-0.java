class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        // push to both the stack
        stack.push(val);
        // But only push the min to minStack
        int currMin = minStack.isEmpty() ? val : Math.min(val, minStack.peek());
        minStack.push(currMin);
    }
    
    public void pop() {
        // pop from both the stack 
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
