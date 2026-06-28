class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int x = 1;
        long total_sum = 0;
        for (int i = nums.length-1; i >= 0 && x <= k; i--) {
            if (mul > 0) {
                total_sum += (long) mul * nums[i];
            } else {
                total_sum += nums[i];
            }
            mul--;
            x++;
        }
        return total_sum;
    }
}