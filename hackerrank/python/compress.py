from itertools import groupby

S = input()

pairs = [list(g) for k, g in groupby(S)]
for pair in pairs:
    print(tuple([len(pair), int(pair[0])]), end=" ")