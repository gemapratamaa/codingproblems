class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        ans = 0
        for j in range(len(nums)):
            for i in range(j):
                if nums[i] == nums[j]:
                    ans += 1
                    
        return ans
        