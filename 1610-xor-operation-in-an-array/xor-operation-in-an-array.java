class Solution {
    public int xorOperation(int n, int start) {
        int result = 0;
        while(n-- > 0) {
            result ^= start;
            start += 2;
        }
        return result;
    }
}