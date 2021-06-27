class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        x, y = nums[:n], nums[n:]
        ans = []
        for i in range(len(x)):
            ans.append(x[i])
            ans.append(y[i])
        return ans