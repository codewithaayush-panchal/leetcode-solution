class Solution {
    public int maximumCount(int[] nums) {

        if (nums[nums.length-1] < 0 || nums[0] > 0) {
            return nums.length;
        }

        int s = 0;
        int e = nums.length-1;
        int p = 0;
        int n = 0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] <= 0) {
                s = m + 1;
            }   else {
                e = m - 1;
            }
        }
        p = nums.length - s;

        s = 0;
        e = nums.length-1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] >= 0) {
                e = m - 1;
            }   else {
                s = m + 1;
            }
        }
        n = e + 1;
        
        return Math.max(p, n);
    }
}