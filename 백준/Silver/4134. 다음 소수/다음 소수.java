
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력받기
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            long n = Long.parseLong(br.readLine());

            while (true) {
                int yes = 0;
                if (n<=1) {
                    n=2;
                }
                for (long j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        yes++;
                        break;
                    }
                }
                if (yes == 0) {
                    sb.append(n + "\n");
                    break;
                } else {
                    n++;
                }
            }

        }
        System.out.println(sb);
    }
}

