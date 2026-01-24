class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) { if(set.contains(c)) continue; set.add(c); }
        return set.size();
    }
}