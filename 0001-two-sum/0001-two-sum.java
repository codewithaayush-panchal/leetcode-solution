class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0; 
        int j = nums.length-1;

        int[] ans = new int[2];

        while(i < j) {
            if (nums[i] + nums[j] == target) {
                ans[0] = i;
                ans[1] = j;
                break;
            }   else {
                if (nums[i] + nums[j] > target) {
                    if (nums[i] > nums[j]) {
                        i++;
                    }   else {
                        j--;
                    }
                }   else {
                    if (nums[i] < nums[j]) {
                        i++;
                    }   else {
                        j--;
                    }
                }
            }
        }

        return ans;

    }
}