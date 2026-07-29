class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }
    
    static void reverse(char[] str, int s, int e) {
        if (s >= e) {
            return;
        }

        char t = str[s];
        str[s] = str[e];
        str[e] = t;

        reverse(str, s+1, e-1);
    }

}