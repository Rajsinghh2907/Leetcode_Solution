class Solution {
    public String reverseParentheses(String s) {
        return reverseParenthesesHelper(s, 0, s.length() - 1);
    }

    private static String reverseParenthesesHelper(String s, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) == '(') {
                int j = findMatchingParenthesis(s, i);
                result.append(new StringBuilder(reverseParenthesesHelper(s, i + 1, j - 1)).reverse());
                i = j;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    private static int findMatchingParenthesis(String s, int start) {
        int balance = 1;
        for (int i = start + 1; i < s.length(); i++) {
            if (s.charAt(i) == '(') balance++;
            if (s.charAt(i) == ')') balance--;
            if (balance == 0) return i;
        }
        return -1; // Invalid input if no matching parenthesis is found
    }
}