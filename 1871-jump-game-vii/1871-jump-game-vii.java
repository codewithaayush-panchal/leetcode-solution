class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        if (s.charAt(s.length() - 1) != '0') {
            return false;
        }
        int i = 0;
        if (i + minJump <= s.length() - 1 && s.length() - 1 <= Math.min(i + maxJump, s.length() - 1)) {
            return true;
        }
        for (int j = 1; j < s.length(); j++) {
            if (s.charAt(j) == '0') {
                if (i + minJump <= j && j <= Math.min(i + maxJump, s.length() - 1)) {
                    i = j;
                    if (i + minJump <= s.length() - 1 && s.length() - 1 <= Math.min(i + maxJump, s.length() - 1)) {
                        return true;
                    }
                }
            }
        }
        return i == s.length() - 1;
    }
}