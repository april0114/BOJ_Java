A = int(input()) #수열의 개수
arr = list(map(int,input().split())) # 수열 만들기 {1,2,3,4,4,5}

dp = [1] * A #DP 초기화
for i in range(A):
    for j in range(i):
        if(arr[j]<arr[i]):
            dp[i] = max(dp[i], dp[j] +1)
    
print(max(dp))