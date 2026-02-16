class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum = 0;
        int[] hash = new int[101];
        for(int i = 0; i < nums.length; i++) hash[nums[i]]++;
        for(int i = 0; i < 101; i++) {
            if(hash[i] != 0 && hash[i] % k == 0) sum += (i * hash[i]);
        }
        return sum;
    }
}