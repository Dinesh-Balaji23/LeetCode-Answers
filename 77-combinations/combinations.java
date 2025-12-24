class Solution {
    public void backtrack(int n, int k, List<List<Integer>> result, List<Integer> combi, int curr) {
        if (combi.size() == k) {
            result.add(new ArrayList<>(combi));
            return;
        }
        for (int i = curr; i <= n; i++) {
            combi.add(i);
            backtrack(n, k, result, combi, i + 1);
            combi.remove(combi.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n, k, result, new ArrayList<>(), 1);
        return result;
    }
}
