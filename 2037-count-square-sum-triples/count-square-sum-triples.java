import java.util.*;

class Solution {
    public int countTriples(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                int square = i * i + j * j;
                int constant = (int) Math.sqrt(square);
                if(constant * constant == square && constant <= n) sum++;
            }
        }
        return sum;
    }
}