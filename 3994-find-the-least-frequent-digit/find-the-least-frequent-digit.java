class Solution {
    public int getLeastFrequentDigit(int n) {
        int arr[] = new int[10];
        while (n != 0) {
            int digit = n % 10;
            arr[digit]++;
            n /= 10;
        }
        int minFreq = Integer.MAX_VALUE;
        int result = -1;
        for (int i = 0; i < 10; i++) {
            if (arr[i] > 0 && arr[i] < minFreq) {
                minFreq = arr[i];
                result = i;
            }
        }
        return result;
    }
}