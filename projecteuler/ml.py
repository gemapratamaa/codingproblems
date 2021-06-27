import numpy as np

labels = [0, 0, 0, 1, 1, 1]
X = np.array([[1, 0], [5, 2], [1, -1], [1, 1], [2, 2], [5, -2]])

clusters = list(set(labels))

separated = []
for i in range(len(clusters)):
    separated.append([])

for i in range(len(X)):
    separated[labels[i]].append(X[i])

#for s in separated:
	#print(s)
means = []
for data in separated:
	means.append(np.mean(data, axis = 0))

means = np.array(means)

print(np.round(means, 3))