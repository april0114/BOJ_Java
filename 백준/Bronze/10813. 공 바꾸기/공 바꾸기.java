
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//N과 M의 값 한줄에 받아오기
        int M = Integer.parseInt(st.nextToken());
        int[] one = new int[N + 1];

        StringBuilder sb = new StringBuilder();

        for(int i =1; i<= N; i++){
            one[i] = i;//1부터 N까지의 값 넣어주기
        }

        for (int p = 0; p < M; p++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int tmp = one[i];
            one[i] = one[j];
            one[j] = tmp;

        }
        for(int i = 1; i <= N; i++){
            sb.append(one[i] + " ");
        }
        System.out.println(sb.toString().trim());
    }
}
