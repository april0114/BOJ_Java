import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(min_calc(N));
    }

    public static int min_calc(int x){
        int dp[] = new int[x+1]; //배열보다 1 큰값으로 크기 지정
        dp[1] = 0; // 1은 연산 할 필요없으니깐 0 넣어주기

        for(int i=2; i<= x; i++){
            dp[i] = dp[i-1] +1; // 9를 1로 만드는 횟수 +1 == 10을 일로 만드는 횟수

            if(i% 2==0){
                dp[i] = Math.min(dp[i], dp[i/2] +1);
            }

            if(i% 3==0){
                dp[i] = Math.min(dp[i], dp[i/3] +1);
            }
        }
        return dp[x];
    }
}
