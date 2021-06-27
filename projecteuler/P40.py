d = ""

counter = 1
while len(d) <= 1000000:
	d += str(counter)
	counter += 1

#print(d)

product = int(d[1-1]) *int(d[10-1]) *int(d[100-1]) *int(d[1000-1]) *int(d[10000-1]) *int(d[100000-1]) *int(d[1000000-1])

print(product)
print(d[12-1])