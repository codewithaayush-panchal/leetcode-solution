class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        
        return p(arr, nums, 0);
    }
    static List<List<Integer>> p(List<Integer> arr, int[] nums, int i) {
        List<List<Integer>> ans = new ArrayList<>();

        if (i == nums.length) {
            ans.add(new ArrayList<>(arr));
            return ans;
        }

        for (int j = 0; j <= arr.size(); j++) {
            List<Integer> arr1 = new ArrayList<>(arr);
            arr1.add(j, nums[i]);
            ans.addAll(p(arr1, nums, i+1));
        }

        return ans;
    }
}