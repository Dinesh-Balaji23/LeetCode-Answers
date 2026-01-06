class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int sum = (i + 1) * (n - i);
            int odd = (sum + 1) / 2;
            result += arr[i] * odd;
        }
        return result;
    }
}