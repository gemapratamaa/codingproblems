if __name__ == '__main__':

    firstLine = input().split(" ")
    x = int(firstLine[0])
    k = int(firstLine[1])

    secondLine = input() 
    print(eval(secondLine) == k)