
def searchInsert(nums, target: int) -> int:
    left = 0
    right = len(nums) - 1
    #m#id = (left + right) // 2
    while left <= right:
        mid = (left + right) // 2
        if nums[mid] < target:
            print("nums[mid] < target")
            left = mid + 1
        elif nums[mid] > target:
            print("nums[mid] > target")
            right = mid - 1
        else:
            print("else")
            break
    return mid // 1
    
searchInsert([1,3,5,6], 2)