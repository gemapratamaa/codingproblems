import re

N = int(input())

Regex_Pattern = r"^(_|\.)([0-9]+)([a-zA-Z]*)(_*)$"    # Do not delete 'r'.


for i in range(N):
    if bool(re.search(Regex_Pattern, input())) == True:
        print("VALID")
    else: 
        print("INVALID")
    
