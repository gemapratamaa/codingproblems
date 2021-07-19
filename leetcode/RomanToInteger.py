class Solution:
    def romanToInt(self, s: str) -> int:
        dictionary = {
            "I" : 1,
            "V" : 5,
            "X" : 10,
            "L" : 50,
            "C" : 100,
            "D" : 500,
            "M" : 1000
        }
        
        result = 0 # FINAL ANSWER
        s = s[::-1]
        
        counter = 0
        
        currentChar = s[counter]
        previousChar = None
        
        for i in range(len(s)):
            previousChar = currentChar
            currentChar = s[counter + i]
            result += dictionary[currentChar]
            
            condition1 = previousChar == "V" and currentChar == "I"
            condition2 = previousChar == "X" and currentChar == "I"
            condition3 = previousChar == "L" and currentChar == "X"
            condition4 = previousChar == "C" and currentChar == "X"
            condition5 = previousChar == "D" and currentChar == "C"
            condition6 = previousChar == "M" and currentChar == "C"

            if condition1 or condition2:
                result -= 2
            elif condition3 or condition4:
                result -= 20
            elif condition5 or condition6:
                result -= 200
                
        return result
            