class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int result = 0;
        for (int i = low; i <= high; i++) {
            String number = String.valueOf(i);
            if (number.length() % 2 != 0) continue;
            int mid = number.length() / 2;
            int sum1 = 0, sum2 = 0;
            for (int j = 0; j < mid; j++) sum1 += number.charAt(j) - '0';
            for (int j = mid; j < number.length(); j++) sum2 += number.charAt(j) - '0';
            if (sum1 == sum2) result++;
        }
        return result;
    }
}