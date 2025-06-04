S = int(input()) #입력값 받기(계단 개수)
#배열 정의(계단 리스트)
arr = [int(input()) for _ in range(S)]
#dp 리스트
dp = [0]*(S)

if S <= 2:
    print(sum(arr))
else: #계단이 3개 이상일때
    dp[0]=arr[0]
    dp[1] = arr[0] + arr[1]
    for i in range(2,S): #3번째 계단부터 점화식을 사용해서 최대값 구하기
        dp[i]=max(dp[i-3]+arr[i-1]+arr[i], dp[i-2]+arr[i])
    print(dp[-1])