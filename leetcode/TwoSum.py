class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        sol = []
        for i in range(len(nums)):
            for j in range(i):
                if nums[i] + nums[j] == target:
                    sol.append(i)
                    sol.append(j)
                    sol.sort()
                    return sol