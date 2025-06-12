def function_P(N):
    P = [0, 1, 1, 1]

    for i in range(4, N + 1):
        P.append(P[i - 2] + P[i - 3])
    
    return P[N]

T = int(input())
ans = []
for i in range(T):
    N = int(input())
    ans.append(function_P(N))

for i in range(len(ans)):
    print(ans[i])
