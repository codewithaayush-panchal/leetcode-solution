class Solution {
    public List<String> generateParenthesis(int n) {
        return generate(n, "");
    }

    List<String> generate(int n, String p) {
        List<String> list = new ArrayList<>();
        if (p.length() == n * 2) {
            if (isValid(p)) {
                list.add(p);
                return list;
            }
            return list;
        }
        String t = p;
        
        list.addAll(generate(n, p+ "("));
        list.addAll(generate(n, p+ ")"));

        return list;
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(c);
            }   else if (st.isEmpty() && i+1 != s.length()) {
                return false;
            }   else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }

}