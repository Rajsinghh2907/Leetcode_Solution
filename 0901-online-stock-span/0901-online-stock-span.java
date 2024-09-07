class StockSpanner {
    // Stack will hold pairs of (price, span)
    private Stack<int[]> stack;

    // Constructor to initialize the stack
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;  // Span for the current price is at least 1 (itself)

        // While stack is not empty and the price at the top of the stack is less than or equal to the current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];  // Add the span of the popped price
        }

        // Push the current price and its span onto the stack
        stack.push(new int[]{price, span});

        return span;  // Return the calculated span for the current price
    }

}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */