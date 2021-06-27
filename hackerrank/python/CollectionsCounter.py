from collections import Counter

if __name__ == '__main__':
    X = int(input())
    shoeSizes_ = input().split(" ")
    shoeSizes = []

    for size in shoeSizes_:
        shoeSizes.append(int(size))
    N = int(input())
   
    shoeDict = dict(Counter(shoeSizes))

    totalCost = 0
    for i in range(N):
        sizeAndPrice = input().split(" ")
        size = int(sizeAndPrice[0])
        price = int(sizeAndPrice[1])
        if shoeDict.get(size, 0) != 0:
            totalCost += price
            shoeDict[size] = shoeDict[size] - 1


    print(totalCost)