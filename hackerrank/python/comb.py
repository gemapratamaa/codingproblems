from itertools import combinations
firstLine = input().split(" ")
s = firstLine[0]
k = int(firstLine[1])

ans = []

for i in range(1, 1 + k):
    L = list(combinations(s, i))

    for comb in L:
        ans.append("".join(sorted(list(comb))))

ans = sorted(ans, key = lambda i: (len(i), i)) 
for a in ans:
    print(a)