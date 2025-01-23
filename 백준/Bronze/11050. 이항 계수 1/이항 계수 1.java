import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());
        long binomial = factorial(N) / (factorial(N - K) * factorial(K));


        System.out.println(binomial);
    }

    static long factorial(int n){
        if (n ==1 || n ==0){
            return 1;
        }
        return n* factorial(n-1);
    }
}
