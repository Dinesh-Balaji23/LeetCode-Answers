class Solution {
    void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }

    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] != ' ') {
                int j = i;
                while (j < n && arr[j] != ' ') j++;
                reverse(arr, i, j - 1);
                i = j;
            } else i++;
        }
        return new String(arr);
    }
}