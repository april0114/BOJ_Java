import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            // 풍선의 개수 N을 입력 받음
            int N = Integer.parseInt(br.readLine());

            // 풍선과 종이를 저장하는 ArrayDeque 생성
            ArrayDeque<int[]> list = new ArrayDeque<>();

            // 풍선의 종이에 적힌 숫자를 입력 받음
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int[] arr = {i + 1, Integer.parseInt(st.nextToken())}; // 풍선 번호와 종이 값을 배열로 저장
                list.add(arr);
            }

            // 풍선 터뜨리기 시작
            while (list.size() > 1) {
                int[] arr = list.pollFirst(); // 첫 번째 풍선 꺼내기
                sb.append(arr[0]).append(" "); // 터진 풍선 번호 추가

                int n = arr[1]; // 종이에 적힌 값
                if (n > 0) { // 양수일 경우 오른쪽으로 이동
                    for (int j = 1; j < n; j++) {
                        list.offerLast(list.pollFirst()); // 첫 번째 풍선을 맨 뒤로 이동
                    }
                } else if (n < 0) { // 음수일 경우 왼쪽으로 이동
                    for (int j = n; j < 0; j++) {
                        list.offerFirst(list.pollLast()); // 마지막 풍선을 맨 앞에 추가
                    }
                }
            }

            sb.append(list.poll()[0]); // 마지막 풍선 번호 추가

            // 결과 출력
            bw.write(sb.toString() + "\n");
            bw.flush();
            bw.close();
        }
    }
