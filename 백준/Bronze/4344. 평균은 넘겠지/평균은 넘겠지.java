import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int C = Integer.parseInt(br.readLine()); //테스트 케이스 C

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); //띄어쓰기로 입력받기
            int N = Integer.parseInt(st.nextToken()); //학생의 수 N

            int numbers[] = new int[N];
            float add = 0;

            for (int j = 0; j < N; j++) {
                numbers[j] = Integer.parseInt(st.nextToken());
                add += numbers[j]; //배열을 다 더한 값
            }
            float average = add / N; // 평균 계산
            int count =0; //평균보다 큰 학생들의 수

            for(int k=0; k<N; k++){
                if(numbers[k]>average){ //평균보다 숫자가 클 경우
                    count ++; //count 증감
                }
            }
            double percentage = (count / (double) N) * 100;//N명 중에서의 비율 계산
            sb.append(String.format("%.3f%%\n", percentage)); // 소수점 3자리까지 출력
        }
        System.out.print(sb);
    }
}
