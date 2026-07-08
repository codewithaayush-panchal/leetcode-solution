class Solution {
    public void rotate(int[] nums, int k) {
        int r = k % nums.length;

        if (r == 0) {
            return;
        }   else {
            int[] arr1 = new int[r];
            int j = 0;
            for (int i = nums.length-r; i < nums.length; i++) {
                arr1[j] = nums[i];
                j++;
            }
            int[] arr2 = new int[nums.length-r];
            for (int i = 0; i < nums.length-r; i++) {
                arr2[i] = nums[i];
            }
            int[] arrF = new int[nums.length];
            for (int i = 0; i < arr1.length; i++) {
                arrF[i] = arr1[i];
            }
            j = 0;
            for (int i = arr1.length; i < nums.length; i++) {
                arrF[i] = nums[j];
                j++;
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = arrF[i];
            }
        }
    }
}