class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char replace = 'a';
        for(char ch : key.toCharArray()) {
            if (ch != ' ' && !map.containsKey(ch)) {
                map.put(ch, replace);
                replace++;
            }
        }
        for(char ch : message.toCharArray()) {
            if (ch == ' ') sb.append(' ');
            else sb.append(map.get(ch));
        }
        return sb.toString();
    }
}