class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> p = new ArrayList<>();

        return subs(nums, p, 0);

    }

    static List<List<Integer>> subs(int[] nums, List<Integer> p, int i) {
        List<List<Integer>> ans = new ArrayList<>();
        if (i == nums.length) {
            ans.add(new ArrayList<>(p));
            return ans;
        }

        p.add(nums[i]);
        ans.addAll(subs(nums, p, i+1));
        p.remove(p.size()-1);
        ans.addAll(subs(nums, p, i+1));

        return ans;

    }
}