import math

while True:
    try:
        number,line,character = map(int,input().split())
        data = input().split()
        pages = 1
        size = len(data[0])
        for i in range(1,len(data)):
            if(size+len(data[i])+1) <= character:
                size += len(data[i])+1
            else:
                pages += 1
                size = len(data[i])
        print(math.ceil(pages/line))
    except(EOFError):
        break
