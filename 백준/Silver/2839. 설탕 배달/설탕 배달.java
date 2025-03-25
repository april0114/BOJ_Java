import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 주어진 설탕 kg
        int maxFiveKg = N / 5; // 5kg 봉지를 최대로 사용할 수 있는 개수

        for (int fiveKg = maxFiveKg; fiveKg >= 0; fiveKg--) { // 5kg 봉지를 최대로 사용하면서 하나씩 줄여감
            int remaining = N - (fiveKg * 5); // 5kg 봉지를 사용하고 남은 무게
            if (remaining % 3 == 0) { // 남은 무게가 3으로 나누어 떨어지는 경우
                int threeKg = remaining / 3;
                System.out.println(fiveKg + threeKg); // 5kg 봉지 개수 + 3kg 봉지 개수 출력
                return; // 정답을 찾았으므로 종료
            }
        }

        System.out.println(-1); // 정확히 나눌 수 없는 경우

    }
}
