class Solution {
    public int minAddToMakeValid(String s) {
        

        // Stack<Character> stack = new Stack<>();
        // int moves = 0; 

       
        // for (char c : s.toCharArray()) {
        //     if (c == '(') {
               
        //         stack.push(c);
        //     } else {
        //         // If it's a closing parenthesis
        //         if (!stack.isEmpty() && stack.peek() == '(') {
        //             // If there's a matching opening parenthesis, pop the stack
        //             stack.pop();
        //         } else {
        //             // If there's no matching opening parenthesis, we need to insert one
        //             moves++;
        //         }
        //     }
        // }

        // // After the loop, any remaining opening parentheses in the stack need to be closed
        // // Each unmatched opening parenthesis will need a closing parenthesis
        // return moves + stack.size();


        Stack<Character> stack = new Stack<>();
        int moves = 0; // Track the number of moves required to make the string valid

        // Iterate through the string character by character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If we encounter a closing parenthesis
            if (ch == ')') {
                int count = 0;

                // Pop characters from the stack until we find an opening parenthesis or the stack is empty
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                // If no matching opening parenthesis was found, it's unbalanced, so we need to add a move
                if (count == 0 && stack.isEmpty()) {
                    moves++; // Need to add an opening parenthesis
                } else {
                    // Otherwise, we found a matching opening parenthesis, so pop it
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
            } else {
                // If we encounter an opening parenthesis, push it onto the stack
                stack.push(ch);
            }
        }
        return moves + stack.size();
    }
}