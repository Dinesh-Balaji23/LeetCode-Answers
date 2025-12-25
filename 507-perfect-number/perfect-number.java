class Solution {
    public boolean checkPerfectNumber(int num) {
        int t = num;
        int sum = 0;
        for(int i = 1; i < t; i++) {
            if(t % i == 0) sum += i;
        }
        return num == sum;
    }
}