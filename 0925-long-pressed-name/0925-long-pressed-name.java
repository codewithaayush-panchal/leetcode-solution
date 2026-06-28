class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        if (typed.length() < name.length()) {
            return false;
        }

        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }   else if (name.charAt(i) != typed.charAt(j) && i != 0 && typed.charAt(j) == name.charAt(i-1)) {
                j++;
            }   else {
                return false;
            }
        }
        while (j < typed.length()) {
            if (typed.charAt(j) != name.charAt(i-1)) {
                return false;
            }
            j++;
        }
        return true && i == name.length();
    }
}