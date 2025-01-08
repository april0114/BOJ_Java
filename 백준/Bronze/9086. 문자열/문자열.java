
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       int N = Integer.parseInt(br.readLine());//테스트 케이스 입력받기
        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            char first = input.charAt(0);
            char last = input.charAt(input.length() - 1);
            sb.append(first).append(last).append('\n');
        }
        System.out.println(sb);
    }
}

