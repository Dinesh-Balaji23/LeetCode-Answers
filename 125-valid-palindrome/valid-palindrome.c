bool isPalindrome(char* s) {
    int first = 0;
    int last = strlen(s) - 1;
    while (first < last) {
        while (first < last && !isalnum(s[first])) first++;
        while (first < last && !isalnum(s[last])) last--;
        if (tolower(s[first]) != tolower(s[last])) return false;
        first++;
        last--;
    }
    return true;
}