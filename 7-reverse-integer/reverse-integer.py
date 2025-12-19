class Solution(object):
    def reverse(self, x):
        reverse = 0
        sign = 1 if x > 0 else -1  # Finding the sign of the number
        x = abs(x)  # Taking sign off because it is hard to handle negative integers in Python

        while x != 0:
            digit = x % 10
            x /= 10
            reverse = reverse * 10 + digit

        if reverse < -2**31 or reverse > 2**31 - 1:
            return 0

        return reverse * sign  # Atlast multiplying with sign