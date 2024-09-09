class Solution {
    public int minAddToMakeValid(String s) {
        

        Stack<Character> stack = new Stack<>();
        int moves = 0; 

       
        for (char c : s.toCharArray()) {
            if (c == '(') {
               
                stack.push(c);
            } else {
                // If it's a closing parenthesis
                if (!stack.isEmpty() && stack.peek() == '(') {
                    // If there's a matching opening parenthesis, pop the stack
                    stack.pop();
                } else {
                    // If there's no matching opening parenthesis, we need to insert one
                    moves++;
                }
            }
        }

        // After the loop, any remaining opening parentheses in the stack need to be closed
        // Each unmatched opening parenthesis will need a closing parenthesis
        return moves + stack.size();
    }
}