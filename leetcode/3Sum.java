class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        sol = []
        for a in range(len(nums)):
            for b in range(a):
                for c in range(b):
                    if nums[a] + nums[b] + nums[c] == 0:
                        temp_sol = [nums[a], nums[b], nums[c]]                  
                        temp_sol.sort()
                        if temp_sol not in sol:
                            sol.append(temp_sol)
        
        return list(sol)
                        