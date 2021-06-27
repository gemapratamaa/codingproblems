class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if needle == "":
            return 0

        if needle == haystack:
            return 0
        maxPossibleIndex = len(haystack) - len(needle) + 1
        print(maxPossibleIndex)

        for i in range(maxPossibleIndex):
            print(haystack[i:i + len(needle)], needle)
            if haystack[i:i + len(needle)] == needle:
                return i

        return -1