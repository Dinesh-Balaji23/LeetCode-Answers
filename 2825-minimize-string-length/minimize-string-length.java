class Solution {
    public int minimizedStringLength(String s) {
        int arr[] = new int[26];
        for(char ch : s.toCharArray()) arr[ch - 'a']++;
        int sum = 0;
        for(int i = 0; i < 26; i++) if(arr[i] > 0) sum++;
        return sum;
    }
}