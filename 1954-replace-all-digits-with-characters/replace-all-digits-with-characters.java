class Solution {
    public String replaceDigits(String s) {
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                char ch = (char)(str.charAt(i - 1) + (str.charAt(i) - '0'));
                str.setCharAt(i, ch);
            }
        }
        return str.toString();
    }
}