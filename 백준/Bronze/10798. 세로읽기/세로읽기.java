
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] letter = new char[5][15]; // 문자 저장 배열
        char[][] letter2 = new char[15][5]; // 문자 저장 배열
        StringBuffer sb =new StringBuffer();

        for (int i = 0; i < 5; i++) {
            String line = br.readLine(); // 한 줄 입력받기
            for (int j = 0; j < line.length(); j++) {
                letter[i][j] = line.charAt(j); // 한 글자씩 저장
            }
        }
        for (int j = 0; j < 15; j++) { // 열 기준
            for (int i = 0; i < 5; i++) { // 행 기준
                if (letter[i][j] != '\0') { // 빈 공간이 아니면 출력
                    sb.append(letter[i][j]);
                }
            }
        }
        System.out.println(sb);
}
}