if __name__ == '__main__':

    firstLine = input().split(" ")
    N = int(firstLine[0])
    X = int(firstLine[1])
    scores = []
    for i in range(X):
        userInput = input().split(" ")
        scores.append(userInput)

    zipped = list(zip(*scores))
    for item in zipped:
        total = 0
        for number in item:
            total += float(number)
        print(total / len(item))
    
         
