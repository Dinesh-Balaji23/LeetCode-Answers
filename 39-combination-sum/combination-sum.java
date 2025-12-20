class Solution {
    public void backtrack(int[] candidates, int target, List<List<Integer>> result, List<Integer> combi, int curr) {
        if (target == 0) {
            result.add(new ArrayList<>(combi));
            return;
        }
        if (target < 0) return;
        
        for (int i = curr; i < candidates.length; i++) {
            combi.add(candidates[i]);
            backtrack(candidates, target - candidates[i], result, combi, i);
            combi.remove(combi.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combi = new ArrayList<>();
        backtrack(candidates, target, result, combi, 0);
        return result;
    }
}
