
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken(); //테스트 케이스 A
        String B = st.nextToken(); //테스트 케이스 A
        StringBuilder sb = new StringBuilder(); //출력용
        StringBuilder sbb = new StringBuilder(); //출력용
        sb.append(A);
        sb.reverse();

        Integer a = Integer.parseInt(sb.toString());
        sbb.append(B);
        sbb.reverse();
        Integer b = Integer.parseInt(sbb.toString());

        if(a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }


        }
    }