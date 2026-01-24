class Solution {
    public int maxDistinct(String s) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()) arr[c - 'a']++;
        int res = 0;
        for(int i = 0; i < 26; i++) if(arr[i] > 0) res++;
        return res;
    }
}