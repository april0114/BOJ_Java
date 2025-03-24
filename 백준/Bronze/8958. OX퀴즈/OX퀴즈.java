import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < test_case; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int additional_point = 0; // 연속 점수
            int total = 0; // 최종 점수

            for (char ch : input.toCharArray()) { // 한 글자씩 확인
                if (ch == 'O') { // 'O'일 경우
                    additional_point++;
                    total += additional_point;
                } else { // 'X'일 경우 (연속성 끊김)
                    additional_point = 0;
                }
            }

            sb.append(total).append("\n"); // 한 줄의 최종 점수만 추가
        }

        System.out.println(sb);
    }
}
