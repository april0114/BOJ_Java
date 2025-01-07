import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력 받기 위해
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력용

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break; //0일 경우 입력 끝내기
            }
            int count = isPrime(N);
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }


    public static int isPrime(int n) { //소수인지 판별하는 함수
        int count = 0; // 소수의 개수를 세는 변수

        for (int i = n+1; i <= 2 * n; i++) {
            if (isPrimeNumber(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }


        for (int j = 2; j <= Math.sqrt(n); j++) {

            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
