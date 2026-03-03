class Solution {
    public int minMaxGame(int[] nums) {
        if (nums.length == 1) return nums[0];
        int n = nums.length;
        int[] newNums = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            int a = nums[2 * i];
            int b = nums[2 * i + 1];
            if (i % 2 == 0) newNums[i] = Math.min(a, b);
            else newNums[i] = Math.max(a, b);
        }
        return minMaxGame(newNums);
    }
}