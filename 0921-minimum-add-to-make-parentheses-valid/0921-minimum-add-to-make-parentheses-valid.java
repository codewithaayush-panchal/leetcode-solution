class Solution {
    public int minAddToMakeValid(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int moves = 0;
        Stack<Character> stack = new Stack<>();
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.isEmpty()) {
                moves++;
            }   else if (s.charAt(i) == ')' && !stack.isEmpty()) {
                stack.pop();
                t--;
                if (i+1 == s.length()) {
                    moves += t;
                }
            }   else {
                stack.push('(');
                t++;
                if (i+1 == s.length()) {
                    moves += t;
                }
            }
        }
        return moves;
    }
}