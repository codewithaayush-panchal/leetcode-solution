class Solution {
    public int hIndex(int[] citations) {
        int s = 0;
        int e = citations.length-1;
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int midV = citations[mid];

            int l = citations.length - mid;

            if (midV >= l) {
                ans = Math.max(ans, l);
                e = mid - 1;
            }   else if (midV < l) {
                s = mid + 1;
            }
        }
        return ans;
    }
}