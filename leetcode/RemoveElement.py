class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        if val in nums:
            while val in nums:
                nums.remove(val)
        
        return len(nums)
        