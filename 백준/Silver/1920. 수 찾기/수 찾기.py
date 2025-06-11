N = int(input()) #N개의 숫자


A = set(map(int,input().split()))

M = int(input()) #M개의 숫자
B = list(map(int, input().split()))

for b in B: #B에 있는 숫자들 하나씩 꺼내서 b
    if b in A: #A에 그 숫자가 있으면 
        print(1)
    else:
        print(0)

