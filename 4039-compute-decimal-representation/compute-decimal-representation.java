class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        while (n != 0) {
            if (n % 10 != 0) list.add((n % 10) * (int)Math.pow(10, k));
            k++; n /= 10;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) res[list.size() - i - 1] = list.get(i);
        return res;
    }
}