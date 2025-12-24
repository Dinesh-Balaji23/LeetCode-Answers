class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(nums, ans, 0);
        return ans;
    }

    public static void permutations(int[] nums, List<List<Integer>> ans, int index) {
        if(index == nums.length) {
            List<Integer> perm = new ArrayList<>();
            for(int num : nums) perm.add(num);
            ans.add(perm);
            return;
        }

        HashSet<Integer> used = new HashSet<>();
        for(int i = index; i < nums.length; i++) {
            if(used.contains(nums[i])) continue;
            used.add(nums[i]);

            swap(nums, i, index);
            permutations(nums, ans, index + 1);
            swap(nums, i, index);
        }
    }

    public static void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}
