class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        return power(n, 0);
    }

    static boolean power(int n, int r) {
        if (n == 1 && r == 0) {
            return true;
        }
        if (n == 0 && r != 0) {
            return false;
        }
        if (n == 1 && r != 0) {
            return false;
        }
        if (r != 0) {
            return false;
        }

        return power(n / 4, n % 4);
    }

}