class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        while (i > 0 && nums[i] <= nums[i - 1]) {
            i--;
        }
        i -= 1;
        if (i == -1) {
            int x = i + 1;
            int y = nums.length - 1;
            while (x < y) {
                int t = nums[x];
                nums[x] = nums[y];
                nums[y] = t;
                x++;
                y--;
            }
        }
        int min = 101;
        int index = -1;
        for (int j = i + 1; j < nums.length && i != -1; j++) {
            if (nums[j] > nums[i]) {
                if (nums[j] <= min) {
                    index = j;
                    min = Math.min(min, nums[j]);
                }
            }
        }
        {
            if (i != -1) {
            int t = nums[i];
            nums[i] = nums[index];
            nums[index] = t;
            }
        }
        int x = i + 1;
        int y = nums.length - 1;
        while (x < y && i != -1) {
            int t = nums[x];
            nums[x] = nums[y];
            nums[y] = t;
            x++;
            y--;
        }
    }
}