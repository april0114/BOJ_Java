T = int(input()) #입력 값 받기

for i in range(T):
    N = int(input())
    a,b = 1,0
    for j in range(N):
        a,b = b, a+b
    print(a,b)