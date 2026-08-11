class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return find(nums, 0, target, 0);
    }

    static int find(int[] nums, int index, int target, int req) {
        int ans  = 0;
        if (index == nums.length) {
            if (target == req) {
                return 1;
            }
            return ans;
        }
        ans += find(nums, index+1, target, req+nums[index]);
        ans += find(nums, index+1, target, req-nums[index]);
        return ans;
    }
}