class Solution(object):
    def isPalindrome(self, x):
        if x < 0: return False
        num_str = str(x)
        reverse = num_str[::-1]
        return int(reverse) == int(num_str)