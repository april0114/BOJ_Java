import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력 받아오기
        String word = br.readLine();
        System.out.println(word.length());

        br.close();
    }
}
