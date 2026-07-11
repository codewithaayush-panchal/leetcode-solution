class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int sum = numbers[i] + numbers[j];
        while (i < j) {
            if (sum == target) {
                return new int[] {i+1, j+1};
            }   else if (sum > target) {
                sum -= numbers[j];
                j--;
                sum += numbers[j];
            }   else {
                sum -= numbers[i];
                i++;
                sum += numbers[i];
            }
        }   
        return new int[] {-1, -1};
    }
}