if __name__ == '__main__':

    condition1 = []
    condition2 = []
    N = int(input())

    numbers = input().split(" ")
    for number in numbers:
        condition1.append(int(number) > 0)
        condition2.append(str(number) == str(number)[::-1])
    
    print(all(condition1) and any(condition2))
