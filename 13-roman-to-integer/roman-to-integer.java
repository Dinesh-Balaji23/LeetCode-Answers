import java.util.*;

class Solution {
    private static final Map<Character, Integer> map = new HashMap<>();
    static {
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
    }

    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            if (i + 1 < s.length() && curr < map.get(s.charAt(i + 1))) sum -= curr;
            else sum += curr;
        }
        return sum;
    }
}