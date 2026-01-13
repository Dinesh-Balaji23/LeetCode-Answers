class Solution {
    public int[] leftRightDifference(int[] nums) {
        if(nums.length == 1) return new int[]{0};
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for(int i = 1; i < nums.length; i++) leftSum[i] = leftSum[i - 1] + nums[i - 1];
        for(int i = 0; i < nums.length - 1; i++) {
            int sum = 0;
            for(int j = i + 1; j < nums.length; j++) sum += nums[j];
            rightSum[i] = sum;
        }
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) result[i] = Math.abs(leftSum[i] - rightSum[i]);
        return result;
    }
}