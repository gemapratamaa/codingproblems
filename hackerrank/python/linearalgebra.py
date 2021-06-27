import numpy
N = int(input())
matrix = []
for _ in range(N):
    row = [float(x) for x in input().split()]
    matrix.append(row)
matrix = numpy.array(matrix)
print(round(numpy.linalg.det(matrix), 2))