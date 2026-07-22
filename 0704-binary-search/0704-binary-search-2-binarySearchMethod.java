class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    static int binarySearch(int[] nums, int s, int e, int target) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (nums[m] == target) {
            return m;
        }

        if (nums[m] > target) {
            return binarySearch(nums, s, m-1, target);
        }   else {
            return binarySearch(nums, m+1, e, target);
        }

    }
}