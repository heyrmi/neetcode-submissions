class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(String token: tokens) {
            switch(token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int rightValue = stack.pop();
                    int leftValue  = stack.pop();
                    stack.push(leftValue - rightValue);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int divideBy = stack.pop();
                    int divideFrom = stack.pop();
                    stack.push(divideFrom / divideBy);
                    break;
                default: 
                    // This is number push to stack
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
