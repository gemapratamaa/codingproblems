class Solution:
    def isPalindrome(self, s: str) -> bool:
        allowed = "qwertyuiopasdfghjklxcvbnm1234567890"
        s = s.lower()
        for char in s:
            if char not in allowed:
                s = s.replace(char, '')
                
        return s == s[::-1]
        