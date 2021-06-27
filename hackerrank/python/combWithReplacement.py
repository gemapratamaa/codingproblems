from itertools import combinations_with_replacement
firstLine = input().split(" ")
s = firstLine[0]
k = int(firstLine[1])

ans = []


L = list(combinations_with_replacement(s, k))

for comb in L:
    ans.append("".join(sorted(list(comb))))

ans = sorted(ans, key = lambda i: (len(i), i)) 
for a in ans:
    print(a)