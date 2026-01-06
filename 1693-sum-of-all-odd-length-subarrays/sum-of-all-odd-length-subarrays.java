class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        long ans = 0;
        int[] pref = new int[n + 1];
        for (int i = 0; i < n; i++) pref[i + 1] = pref[i] + arr[i];
        for (int len = 1; len <= n; len += 2) {
            for (int l = 0, r = len - 1; r < n; l++, r++) ans += pref[r + 1] - pref[l];
        }
        return (int)ans;
    }
}