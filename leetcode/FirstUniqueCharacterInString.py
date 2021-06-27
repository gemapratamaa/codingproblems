class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = dict()
        l = list()
        for i in range(len(s)):
            if s[i] not in d.keys():
                d[s[i]] = 1
                l.append(s[i])
            else:
                d[s[i]] = d[s[i]] + 1
                
                
        for key in d:
            if d[key] == 1:
                return s.find(key)
        
        return -1
            
            