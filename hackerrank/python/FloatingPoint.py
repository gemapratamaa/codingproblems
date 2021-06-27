def solve(s):
    try:
        a = float(s)
        print("True")
    except:
        print("False")
        return
if __name__ == "__main__":
    N = int(input())
    for i in range(N):
        s = input()
        solve(s)