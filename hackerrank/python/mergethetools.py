def split_string(string, k):
    parts = []
    for i in range(0, len(string), k):
        parts.append(string[i:i+k])
    
    return parts

def merge_the_tools(string, k):
    splitted = split_string(string, k)
    processed = []
    for chunk in splitted:
        removed_duplicate = "".join(list(dict.fromkeys(chunk)))
        
        print(removed_duplicate)

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)