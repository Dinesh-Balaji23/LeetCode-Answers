bool isPowerOfFour(int n) {
    if(n > 0 && (n & n - 1) == 0 && n % 3 == 1) return 1;
    return 0;
}