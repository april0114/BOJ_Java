import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            int test_case = Integer.parseInt(br.readLine());
            sb.append(num(test_case)).append("\n");
        }
        System.out.println(sb);
    }
    public static int num(int x){
        int dp[] = new int[x+1]; //배열 생성하기
        
        //x가 1~3일 경우 배열을 만들지 않고 바로 리턴
        if (x == 1) return 1;
        if (x == 2) return 2;
        if (x == 3) return 4;
        
        dp[1] =1; //1개의 경우의 수
        dp[2] =2; // 2= 1+1, 2 (2개의 경우의 수)
        dp[3] =4; // 3 =1+1+1, 2+1, 1+2, 3 (4개의 경우의 수)

        for(int i=4; i<=x; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3]; //공식 생성
        }
        return dp[x];
    }
}
