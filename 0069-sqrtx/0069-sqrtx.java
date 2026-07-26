class Solution {
    public int mySqrt(int x) {
        long s = 0;
        long e = x;
        long mid = s + (e - s) / 2;
        while(s <= e) {
            mid = s + (e - s) / 2;
            if ( mid * mid == x ) {
                return (int)(mid);
            }
            if ( mid * mid > x ) {
                e = mid-1;
            }   else {
                s = mid+1;
                if ( (mid + 1) * (mid + 1) > x ) {
                    break;
                }
            }
        }
        return (int)(mid);
    }
}