class Solution {
    public int numWays(String s) {
        long n = s.length();
        long mod = 1_000_000_007;
        int cOfOne = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cOfOne++;
            }
        }
        if (cOfOne == 0) { 
            if (s.length() == 3) {
                return 1;
            } 
            return (int) (((n - 1) * (n - 2) / 2) % mod);
        }
        if (cOfOne % 3 != 0) {
            return 0;
        }
        int eOf_1 = -1;
        int sOf_2 = -1;
        int eOf_2 = -1;
        int sOf_3 = -1;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c++;
            }
            if (c == cOfOne / 3) {
                eOf_1 = i;
                break;
            }
        }
        for (int i = eOf_1+1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c++;
            }
            if (c == (cOfOne / 3) + 1) {
                sOf_2 = i;
                break;
            }
        }
        if (cOfOne == 3) {
            eOf_2 = sOf_2;
        }   else {
            for (int i = sOf_2+1; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    c++;
                }
                if (c == (cOfOne / 3) * 2) {
                    eOf_2 = i;
                    break;
                }
            }
        }
        for (int i = eOf_2+1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c++;
            }
            if (c == ((cOfOne / 3) * (2)) + 1) {
                sOf_3 = i;
                break;
            }
        }
        long ans = (long)((sOf_2 - eOf_1)) * (sOf_3 - eOf_2);
        int AnsF = (int)(ans % mod);
        return AnsF;
    }
}