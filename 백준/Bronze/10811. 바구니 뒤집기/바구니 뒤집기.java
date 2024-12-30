
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken()); //M개 입력받기
        int N = Integer.parseInt(st.nextToken()); //N개 입력받기

        int[] basket = new int[M]; //M크기의 바구니
        for (int i = 0; i < M; i++) {
            basket[i] = i+1; ///1부터 M까지 넣어주기
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer stt = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(stt.nextToken())-1; //공백 구분 입력받기
            int y = Integer.parseInt(stt.nextToken())-1;


            while (x < y) {
                int tmp = basket[x];
                basket[x] = basket[y];
                basket[y] = tmp;
                x++;
                y--;
            }
        }
        // 결과 출력
        for (int i = 0; i < M; i++) {
            sb.append(basket[i]).append(" ");
        }
            System.out.println(sb);

        }

    }

