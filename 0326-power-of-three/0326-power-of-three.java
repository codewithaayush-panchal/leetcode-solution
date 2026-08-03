class Solution {
    public boolean isPowerOfThree(int n) {
        return powerOfThree(n, 0);
    }

    static boolean powerOfThree(int n, int r) {
        if (n % 2 == 0 || n <= 0) {
            return false;
        }
        if (n == 1 && r == 0) {
            return true;
        }   
        if (r != 0) {
            return false;
        }

        return powerOfThree(n / 3, n % 3);
    }

}