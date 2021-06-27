class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        ans = []
        for i in range(len(nums)):
            current = 0
            for j in range(len(nums)):
                if j != i and nums[j] < nums[i]:
                    current += 1
                    
            ans.append(current)
                
                
        return ans
            
                
        