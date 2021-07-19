def divide(dividend: int, divisor: int) -> int:
    answer = 0
    if dividend < 0:
        return divide(-dividend, divisor) * -1
    
    if divisor < 0:
        divisor *= -1
        while dividend - divisor >= 0:
            dividend -= divisor
            answer += 1
            
        return -answer
        
    elif divisor > 0:
        while dividend - divisor >= 0:
            dividend -= divisor
            answer += 1
            
        return answer