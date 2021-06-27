class Student:
    def __init__(self, name, score):
        self.name = name
        self.score = score
        
        
if __name__ == '__main__':
    def selectionSort(A, B):
        for i in range(len(A)): 
            
            # Find the minimum element in remaining  
            # unsorted array 
            min_idx = i 
            for j in range(i+1, len(A)): 
                if A[min_idx] > A[j]: 
                    min_idx = j 
                    
            # Swap the found minimum element with  
            # the first element         
            A[i], A[min_idx] = A[min_idx], A[i] 
            B[i], B[min_idx] = B[min_idx], B[i] 
        
        return A, B
            
    names = []
    scores = []
    students = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append(Student(name, score))
        names.append(name)
        scores.append(score)
        scores, names = selectionSort(scores, names)
    
    secondLowestScore = scores[-2]
    indexes = [i for i in range(len(scores)) if scores[i] == secondLowestScore]
    
    answer = []
    for index in indexes:
        answer.append(names[index])

    answer.sort()
    for ans in answer:
        print(ans)


