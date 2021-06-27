class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        unique = []
        for num in nums:
            if num not in unique:
                unique.append(num)
            else:
                unique.remove(num)
        
        return unique[0]
        
        