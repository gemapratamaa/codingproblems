import re

def subString(string):
    vowels = "AEUIO"
    consonants = "QWRTYPSDFGHJKLZXCVBNM"
    vowelSubstring = []
    consonantSubstring = []
    n = len(string)
    for i in range(n):
        for L in range(i+1,n+1):
            substring = string[i: L]
            if substring[0] in vowels:
                vowelSubstring.append(substring)
            elif substring[0] in consonants:
                consonantSubstring.append(substring)
    return sorted(list(set(vowelSubstring))), sorted(list(set(consonantSubstring)))

def occurrences(string, sub):
    return sum(1 for _ in re.finditer('(?={})'.format(sub), string))

def minion_game(string):
    stuart = 0
    kevin = 0
    vowels, consonants = subString(string)
    for v in vowels:
        score = occurrences(string, v)
        kevin += score 
    
    for c in consonants:
        score = occurrences(string, c)
        stuart += score 
    
    if stuart > kevin:
        print("Stuart", stuart)
    elif stuart < kevin:
        print("Kevin", kevin)
    else:
        print("Draw")

if __name__ == '__main__':
    s = input()
    minion_game(s)