import numpy

firstLine = [int(x) for x in input().split()]
rows = firstLine[0]
columns = firstLine[1]

matrix = []
for i in range(rows):
    M = numpy.array([int(x) for x in input().split()])
    matrix.append(M)
    
print(numpy.transpose(matrix))
print(numpy.array(matrix).flatten())