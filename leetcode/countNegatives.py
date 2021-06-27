class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        answer = 0
        for row in grid:
            for num in row:
                if num < 0:
                    answer += 1
                    
        return answer