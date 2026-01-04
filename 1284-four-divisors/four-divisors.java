import java.util.*;

class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            int curSum = 0;
            for (int x = 1; x * x <= nums[i]; x++) {
                if (nums[i] % x == 0) {
                    if (x == nums[i] / x) {
                        cnt++;
                        curSum += x;
                    } else {
                        cnt += 2;
                        curSum += x + (nums[i] / x);
                    }
                }
                if (cnt > 4) break;
            }
            if (cnt == 4) sum += curSum;
        }
        return sum;
    }
}
