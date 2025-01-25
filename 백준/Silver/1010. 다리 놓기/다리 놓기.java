import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i< T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            System.out.println(Bridge(N,M));
        }

    }
    public  static long Bridge(int n, int m){
        long result = 1;
            for (int i = 0; i < n; i++) {
            result *= (m - i);   // 분자 계산
            result /= (i + 1);   // 분모 계산
        }

        return result;
    }

}
