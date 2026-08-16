class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (s.charAt(i) == ')') {
                    if (!stack.isEmpty()) {
                        char c1 = stack.pop();
                        if (c1 != '(') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                if (s.charAt(i) == '}') {
                    if (!stack.isEmpty()) {
                        char c1 = stack.pop();
                        if (c1 != '{') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                if (s.charAt(i) == ']') {
                    if (!stack.isEmpty()) {
                        char c1 = stack.pop();
                        if (c1 != '[') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}