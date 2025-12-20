class Solution {
    public String countAndSay(int n) {
        if (n==1) return "1";
        int left=0,right=1;
        String s = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        for (;right<s.length();right++) {
            if (s.charAt(right) != s.charAt(left)) {
                sb.append(right-left).append(s.charAt(left));
                left=right;
            }
        }
        sb.append(right-left).append(s.charAt(left));
        return sb.toString();
    }
}