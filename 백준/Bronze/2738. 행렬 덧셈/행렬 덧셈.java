
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int size1 = Integer.parseInt(st.nextToken());
        int size2 = Integer.parseInt(st.nextToken()); //3 3 입력받기

        int[][] A = new int[size1][size2];
        int[][] B = new int[size1][size2]; // 2차원 배열 사이즈 3 3 생성

        // A 배열 입력받기
        for (int i = 0; i < size1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size2; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // B 배열 입력받기
        for (int i = 0; i < size1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size2; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // A와 B 배열의 합 출력하기
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                sb.append(A[i][j] + B[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}