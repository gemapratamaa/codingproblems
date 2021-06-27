import re
T = int(input())
for _ in range(T):
    string = input()
    try:
        x = re.search(string, "aaa")
        print("True")
    except:
        print("False")