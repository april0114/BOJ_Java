import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder(); //결과 출력용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력받기
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); //A 입력받기
            int B = Integer.parseInt(st.nextToken()); //B 입력받기


            int gcd = getGCD(A, B); // GCD 계산
            int lcm = (A * B) / gcd; // LCM 계산
            sb.append(lcm).append("\n");
        }
        System.out.print(sb);

    }
        private static int getGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }


}
