uint32_t reverseBits(uint32_t n) {
    unsigned int reverse = 0; // Unsigned because if n exceeds the limit of 2^32, then it still checks for it
    for(int i = 0; i < 32; i++){
        int bit = n & 1; // n % 10
        reverse = (reverse << 1) | bit; // rev = (rev * 10) + digit;
        n >>= 1; // n = n / 10;
    }
    return reverse;
}