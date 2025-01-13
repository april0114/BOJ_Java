
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스 T
        StringBuilder sb = new StringBuilder(); //출력용
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); //띄어쓰기로 구분하려고
            int R = Integer.parseInt(st.nextToken()); //R번 입력받을거
            String S = st.nextToken();// 문자열 s입력

            for(int j = 0; j <S.length(); j++) { //문자열의 길이만큼
                sb.append(String.valueOf(S.charAt(j)).repeat(R)); //r번 반복하는데 각 첫번째 문자 꺼내오기
            }
            sb.append("\n"); //줄분리를 위해서
        }
        System.out.println(sb);
        }
    }


