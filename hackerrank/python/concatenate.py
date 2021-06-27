import numpy as np

nmp = [int(x) for x in input().split()]
N = nmp[0]
M = nmp[1]
matrix = []
for i in range(N + M):
    row = [int(x) for x in input().split()]
    matrix.append(row)
    
matrix = np.array(matrix)