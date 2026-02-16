uint32_t reverseBits(uint32_t n) {
    unsigned int reverse = 0;
    for(int i = 0; i < 32; i++){
        int bit = n & 1;
        reverse = (reverse << 1) | bit;
        n >>= 1;
    }
    return reverse;
}