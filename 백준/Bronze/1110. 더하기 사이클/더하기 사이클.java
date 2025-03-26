import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 주어진 N
        int count = 0; //사이클 수
        int given = N; //처음 주어진 수

        while(true){
            N = ((N%10) * 10) + (((N/10) + (N %10)) % 10);
            count ++;

            if( given == N){
                break;
            }
        }
        System.out.println(count);

    }
}
