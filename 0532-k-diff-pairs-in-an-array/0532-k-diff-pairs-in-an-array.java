class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

        int ans = 0;
        for (int i = 0; i < nums.length-1; i++) {
            
            int nOfD = 1;
            while (i < nums.length - 1 && nums[i] == nums[i+1]) {
                i++;
                nOfD++;
            }
            if (k == 0 && nOfD >= 2) {
                i--;
            }
            int s = i+1;
            int e = nums.length-1;
            while (s <= e ) {
                int m = s + (e - s) / 2;

                if (Math.abs(nums[i]-nums[m]) == k) {
                    ans++;
                    break;
                }
                if (Math.abs(nums[i]-nums[m]) > k) {
                    e = m - 1;
                }   else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }
}