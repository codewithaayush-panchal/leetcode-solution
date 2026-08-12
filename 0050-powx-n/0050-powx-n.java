class Solution {
    public double myPow(double x, int n) {
        return pow(x, n);
    }

    static double pow(double x, long n) {
        double res = 1;
        double base = x;
        long mod = 1_000_000_007;
        if (n > 0) {
            while (n > 0) {
                if (n % 2 != 0) {
                    res = (res * base) % mod;
                }
                base = (base * base) % mod;
                n /= 2;
            }
            return res;
        }   else if (n < 0) {
            n = -1 * n;
            while (n > 0) {
                if (n % 2 != 0) {
                    res = (res * base) % mod;
                }
                base = (base * base) % mod;
                n /= 2;
            }
            return (1.0 / res) % mod;
        }
        return 1.0;
    }
}