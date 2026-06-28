class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i > -1; i--) {
            if (s.charAt(i) == '#') {
                i -= 2;
                int k = (s.charAt(i) - '0') * 10 + (s.charAt(i+1) - '0');
                sb.append((char)(96+k));
            }   else {
                sb.append((char)(96 + s.charAt(i) - '0'));
            }
        }
        return sb.reverse().toString();
    }
}