K = int(input())
rooms = [int(x) for x in input().split(" ")]

data = dict() 
for r in rooms:
    if r not in data.keys():
        data[r] = 1
    else:
        data[r] += 1
        
for d in data:
    if data[d] == 1:
        print(d)
