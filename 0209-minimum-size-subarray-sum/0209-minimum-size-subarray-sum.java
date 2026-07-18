class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int ans = nums.length+1;
        int i = 0;
        int j = 0;
        while (j < nums.length && i <= j) {
            sum += nums[j];
            if (sum < target) {
                j++;
            }   else {
                ans = Math.min(ans, j-i+1);
                sum -= nums[i];
                sum -= nums[j];
                i++;
            }
        }
        if (ans == nums.length+1) {
            return 0;
        }
        return ans;
    }
}