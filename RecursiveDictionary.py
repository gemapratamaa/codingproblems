def printDictionary(d: dict):
    keys = [k for k in d.keys()]
    values = [d[k] for k in d.keys()]

    print(printListHelper(keys, values))


def printListHelper(k: list, v: list):
    if len(k) == 1:
        return str(k[0]) + ": " + str(v[0])
    
    if len(k) >= 2:
        #print("masuk else")
        return str(k[0]) + ": " + str(v[0]) + ", " + printListHelper(k[1:], v[1:])



def main():
    sampleDict = {
        "a": 1,
        "b": 2,
        "c": 3,
    }
    printDictionary(sampleDict)
    #sampleList = [1,2,3,4,5]
    #print(printListHelper(sampleList))

if __name__ == "__main__":
    main()