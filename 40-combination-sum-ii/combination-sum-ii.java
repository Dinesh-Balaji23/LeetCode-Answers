import java.util.*;

class Solution {
    public void backtrack(int index, int[] candidates, int target, List<Integer> subset, List<List<Integer>> result) {
        if (target < 0) return;
        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            subset.add(candidates[i]);
            backtrack(i + 1, candidates, target - candidates[i], subset, result);
            subset.remove(subset.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); 
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }
}
