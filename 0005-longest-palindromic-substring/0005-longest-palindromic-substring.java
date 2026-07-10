class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        int size = 1;
        String ans = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            int j = s.length() - 1;
            while (j > i) {
                if (s.charAt(j) == s.charAt(i)) {
                    boolean isYoN = isPalindrome(s.substring(i, j + 1));
                    if (isYoN && s.substring(i, j + 1).length() > size) {
                        ans = s.substring(i, j + 1);
                        size = s.substring(i, j + 1).length();
                    }
                }
                j--;
            }
        }

        return ans;
    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}