class Solution {
    public void backtrack(int index, int[] nums, List<Integer> subset, List<List<Integer>> result) {
        if(index == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }
        backtrack(index + 1, nums, subset, result);
        subset.add(nums[index]);
        backtrack(index + 1, nums, subset, result);
        subset.remove(subset.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }
}