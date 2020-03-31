import itertools

while True:
    data = input().split()
    total = int(data[0])
    constraint = int(data[1])
    sum = 0
    possibilities = []
    if total == 0 and constraint == 0:
        break
    for i in range(constraint) :
        data = input().split()
        a = int(data[0])
        b = int(data[1])
        c = int(data[2])
        possibilities.append((a,b,c))
    number = range(total)
    for j in itertools.permutations(number) :
        count = 0
        values = {}
        for k in j :
            values[k] = count
            count +=1
        flag = True
        for (a,b,c) in possibilities:
            if c >= 0:
                if abs(values[a]-values[b]) > c:
                    flag = False
                    break
            else :
                if abs(values[a]-values[b]) < -c:
                    flag = False
                    break
        if flag == True:
            sum +=1
    print(sum)
