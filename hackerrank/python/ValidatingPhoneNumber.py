
def solve(s):
    if len(s) != 10:
        print("NO")
        return
    for char in s:
        if char not in "0123456789":
            print("NO")
            return
    if s[0] in "789":
        print("YES")
    else:
        print("NO")    

if __name__ == "__main__":
    N = int(input())
    for i in range(N):
        phone = input()
        solve(phone)
