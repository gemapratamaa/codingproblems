class Solution:
    def reverse(self, x: int) -> int:
        if 0 < x < (2**31 - 1):
            target = str(x)
            target = target[::-1]
            if 0 < int(target) < (2**31 - 1):
                return int(target)
            else:
                return 0
        elif -(2**31) < x < 0:
            target = str(-x)
            target = target[::-1]
            if -(2**31) < int("-" + target) < 0:
                return int('-' + target)
            else:
                return 0
        else:
            return 0
        