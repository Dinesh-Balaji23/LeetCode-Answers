class Solution {
    public static int products(int n) {
        int sum = 1;
        while(n != 0) {
            int digit = n % 10;
            sum *= digit;
            n /= 10;
        }
        return sum;
    }
    public int smallestNumber(int n, int t) {
        while (true) {
            if (products(n) % t == 0) return n;
            n++;
        }
    }
}