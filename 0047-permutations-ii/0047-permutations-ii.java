class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        
        List<List<Integer>> ans = p(arr, nums, 0);

        for (int i = 0; i < ans.size(); i++) {
            for (int j = i+1; j < ans.size(); j++) {
                if (ans.get(i).equals(ans.get(j))) {
                    ans.remove(j);
                    j--;
                }
            }
        }
        return ans;
    }
    static List<List<Integer>> p(List<Integer> arr, int[] nums, int i) {
        List<List<Integer>> ans = new ArrayList<>();

        if (i == nums.length) {
            return ans;
        }

        for (int j = 0; j <= arr.size(); j++) {
            List<Integer> arr1 = new ArrayList<>(arr);
            arr1.add(j, nums[i]);
            if (arr1.size() == nums.length) {
                ans.add(arr1);
            }
            ans.addAll(p(arr1, nums, i+1));
        }

        return ans;
    }
}