from collections import namedtuple

if __name__ == '__main__':
    N = int(input())
    columns = input().split()
    attributes = ",".join(columns)
    Record = namedtuple('Record', attributes)
    records = []

    for i in range(N):

        instanceAttrs = input().split()
        newRecord = Record(*instanceAttrs)
        records.append(newRecord)

    totalMarks = 0
    for r in records:
        totalMarks += float(r.MARKS)

    print(totalMarks / len(records))

