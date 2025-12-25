class Solution {
    public boolean checkPerfectNumber(int num) {
        int t = num;
        int sum = 0;
        for(int i = 1; i <= (t / 2); i++) {
            if(t % i == 0) sum += i;
        }
        return num == sum;
    }
}