class Solution:
    def interpret(self, command: str) -> str:
        ans = command
        ans = ans.replace("()", "o")
        ans = ans.replace("(al)", "al")
        return ans